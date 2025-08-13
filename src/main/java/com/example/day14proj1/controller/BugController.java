package com.example.day14proj1.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14proj1.dto.BugResponseDTO;
import com.example.day14proj1.entity.Bug;
import com.example.day14proj1.service.BugService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bugs")
@RequiredArgsConstructor
public class BugController {

    private final BugService bugService;

    @GetMapping("/search")
    public ResponseEntity<List<BugResponseDTO>> getFilteredBugs(
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String assignee,
            @RequestParam(required = false) String project) {

        List<BugResponseDTO> bugs = bugService.filterBugs(status, assignee, project);
        return ResponseEntity.ok(bugs);
    }

    @GetMapping("/all")
    public ResponseEntity<Page<BugResponseDTO>> getAllBugs(
            @PageableDefault(size = 5, sort = "title") Pageable pageable) {
        Page<BugResponseDTO> bugsPage = bugService.getAllBugs(pageable);
        return ResponseEntity.ok(bugsPage);
    }

    // Accessible only by admin
    @PostMapping("/admin/create")
    public ResponseEntity<BugResponseDTO> createBug(@RequestBody Bug bug) {
        return ResponseEntity.ok(bugService.createBug(bug));
    }

    // Accessible only by admin
    @DeleteMapping("/admin/delete")
    public ResponseEntity<BugResponseDTO> deleteBug(@RequestParam Long id) {
        return ResponseEntity.ok(bugService.deleteBug(id));
    }

    // Accessible only by admin
    @PutMapping("/admin/update")
    public ResponseEntity<BugResponseDTO> updateBug(@RequestParam Long id, @RequestBody Bug bug) {
        return ResponseEntity.ok(bugService.updateBug(id,bug));
    }

}