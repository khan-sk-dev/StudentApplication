# StudentApplication

A simple Spring Boot application to manage student records. The application allows users to perform CRUD operations (Create, Read, Update, Delete) on student data via RESTful APIs.

## Features

- **Add a new student**: Register new students with their details.
- **View all students**: Retrieve a list of all registered students.
- **Update student information**: Modify the name and email of an existing student.
- **Delete a student**: Remove a student from the database.

## Technologies Used

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL** (Database)
- **Hibernate** (ORM)
- **Maven** (Dependency Management)

## Prerequisites

- Java 11 or higher installed
- PostgreSQL installed and running
- Maven installed

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sohaibkhan-007/StudentApplication.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd StudentApplication
   ```

3. **Configure the database**:
   - In `src/main/resources/application.properties`, update the following properties with your PostgreSQL credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application**:
   - The application will be running on `http://localhost:8081/`.

## API Endpoints

- **GET /api/v1/student** - Fetch all students
- **POST /api/v1/student** - Add a new student (Provide `name` and `email` in the request body)
- **PUT /api/v1/student/{id}?name=NewName&email=NewEmail** - Update a student's name and email
- **DELETE /api/v1/student/{id}** - Delete a student by ID

### Example API Calls

- **Add a student**:
   ```bash
   POST http://localhost:8081/api/v1/student
   {
     "name": "John Doe",
     "email": "john.doe@example.com",
     "dob": "2000-05-12"
   }
   ```

- **Update a student**:
   ```bash
   PUT http://localhost:8081/api/v1/student/1?name=JaneDoe&email=jane.doe@example.com
   ```
