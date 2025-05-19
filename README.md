```markdown
<!-- Project Title and Badge -->
# 🎓 StudentApplication

![Spring Boot](https://img.shields.io/badge/SpringBoot-2.7.0-brightgreen?logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-11-blue?logo=java)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql)
![License](https://img.shields.io/github/license/khan-sk-dev/StudentApplication?style=flat-square)

A simple and elegant Spring Boot application for managing student records with full CRUD capabilities via RESTful APIs.

---

## 🖼️ Preview

![Student Application Banner](https://raw.githubusercontent.com/khan-sk-dev/StudentApplication/main/assets/banner.png)

---

## 🚀 Features

✨ **Add a New Student** – Register with name, email, and DOB  
📋 **View All Students** – Retrieve the list of all registered students  
✏️ **Update Student Info** – Edit a student's name and email  
🗑️ **Delete a Student** – Remove a student from the system

---

## 🧰 Tech Stack

| Technology         | Description                   |
|--------------------|-------------------------------|
| ![Java](https://img.shields.io/badge/Java-11-blue?logo=java) | Core Programming Language     |
| ![Spring Boot](https://img.shields.io/badge/SpringBoot-Framework-brightgreen?logo=spring-boot) | Backend Framework             |
| ![Hibernate](https://img.shields.io/badge/Hibernate-ORM-yellow?logo=hibernate) | ORM for Data Persistence      |
| ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql) | Relational Database           |
| ![Maven](https://img.shields.io/badge/Maven-Build-orange?logo=apache-maven) | Dependency Management         |

---

## 📦 Prerequisites

- ✅ Java 11 or higher  
- ✅ PostgreSQL installed and running  
- ✅ Maven installed  

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/khan-sk-dev/StudentApplication.git
cd StudentApplication
````

### 2️⃣ Configure the Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

> 🚀 App runs on: `http://localhost:8081/`

---

## 🔌 REST API Endpoints

| Method   | Endpoint                                           | Description                  |
| -------- | -------------------------------------------------- | ---------------------------- |
| `GET`    | `/api/v1/student`                                  | Retrieve all students        |
| `POST`   | `/api/v1/student`                                  | Add a new student            |
| `PUT`    | `/api/v1/student/{id}?name=NewName&email=NewEmail` | Update student details by ID |
| `DELETE` | `/api/v1/student/{id}`                             | Delete a student by ID       |

---

## 📬 Sample API Calls

### ➕ Add a Student

```http
POST /api/v1/student
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "dob": "2000-05-12"
}
```

### 🔁 Update a Student

```http
PUT /api/v1/student/1?name=JaneDoe&email=jane.doe@example.com
```

---

## 🗃️ Folder Structure

```bash
StudentApplication
├── src
│   └── main
│       ├── java/com/example/student
│       │   ├── controller
│       │   ├── model
│       │   ├── repository
│       │   └── service
│       └── resources
│           └── application.properties
├── pom.xml
└── README.md
```

---

## 📎 Useful Links

* 📂 [Edit this README](https://github.com/khan-sk-dev/StudentApplication/edit/main/README.md)
* 📖 [Spring Boot Documentation](https://spring.io/projects/spring-boot)
* 🐘 [PostgreSQL Docs](https://www.postgresql.org/docs/)

---

## 📄 License

This project is licensed under the MIT License – see the [LICENSE](https://github.com/khan-sk-dev/StudentApplication/blob/main/LICENSE) file for details.

---

> Made with ❤️ using Spring Boot & PostgreSQL
