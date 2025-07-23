# 🧑‍🎓 Student CRUD API - Spring Boot + MySQL

This is a simple **Student Management REST API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. It supports full CRUD operations (Create, Read, Update, Delete) and is ideal for learning or resume projects.

---

## 🚀 Features

- Create new student records
- Get all students or a specific student by ID
- Update student details
- Delete student by ID
- MySQL integration via Spring Data JPA
- Clean project structure with layered architecture

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.2.x
- Spring Web
- Spring Data JPA
- MySQL Database
- Maven (Build Tool)
- IntelliJ IDEA (Recommended IDE)

---

## 🗃️ Database Configuration

Make sure MySQL is installed and running. Then update your `application.properties` like this:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get student by ID    |
| POST   | `/students`      | Create new student   |
| PUT    | `/students/{id}` | Update student by ID |
| DELETE | `/students/{id}` | Delete student by ID |

🙋‍♂️ Author
`Avi Jain`
Java Full Stack Developer | Node.js Enthusiast
