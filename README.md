# Bug Tracker API (Spring Boot)

A simple **Spring Boot** application for tracking software bugs with role-based access control using **Spring Security**.  
It supports filtering, pagination, creation, updating, and deletion of bug records.  

---

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-java-day18-proj1/
    ├── README.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── day14proj1/
    │   │   │               ├── Day14proj1Application.java
    │   │   │               ├── config/
    │   │   │               │   └── SecurityConfig.java
    │   │   │               ├── controller/
    │   │   │               │   └── BugController.java
    │   │   │               ├── dto/
    │   │   │               │   └── BugResponseDTO.java
    │   │   │               ├── entity/
    │   │   │               │   └── Bug.java
    │   │   │               ├── mapper/
    │   │   │               │   └── BugMapper.java
    │   │   │               ├── repository/
    │   │   │               │   └── BugRepository.java
    │   │   │               └── service/
    │   │   │                   └── BugService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── day14proj1/
    │                       └── Day14proj1ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties

```

---

## 🚀 Features
- **Role-based security** with in-memory users (`ADMIN`, `USER`)
- **Filter bugs** by status, assignee, or project
- **Pagination** for bug listing
- **CRUD** operations on bugs
- **DTO Mapping** using MapStruct
- **PostgreSQL** database integration

---

## 🔧 Requirements
- Java 17+
- Maven 3+
- PostgreSQL (running locally or remotely)

---

## ⚙️ Setup

### 1. Clone the Repository
```bash
git clone https://github.com/Adrin-Bershik-C-J/java-day18-proj1.git
cd java-day18-proj1
```

### 2. Configure Database
```
spring.datasource.url=jdbc:postgresql://localhost:5432/day14proj1
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
```

The app will start at http://localhost:8080.
