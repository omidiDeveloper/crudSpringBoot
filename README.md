# 🎓 Student Manager Backend

A powerful **Spring Boot MVC** application for managing student records — built using **Kotlin**, **Spring Boot**, and **JPA (Hibernate)**.
This backend service provides RESTful APIs to **create, read, update, and delete (CRUD)** student data efficiently.
It is designed to integrate easily with Android, web, or desktop frontends.

---

## 🧩 Table of Contents

* [⚙️ Features](#️-features)
* [🏗️ Architecture](#-architecture)
* [🧠 Technologies Used](#-technologies-used)
* [📁 Project Structure](#-project-structure)
* [🚀 API Endpoints](#-api-endpoints)
* [💾 Database Configuration](#-database-configuration)
* [▶️ Running the Project](#️-running-the-project)
* [📸 Screenshots](#-screenshots)
* [📜 License](#-license)

---

## ⚙️ Features

✅ Built with **Spring Boot** and **Kotlin**
✅ Follows **MVC Architecture**
✅ CRUD operations for students
✅ Uses **Spring Data JPA** for database management
✅ Supports **MySQL** integration
✅ Well-structured RESTful API design
✅ Ready for Android or Web integration

---

## 🏗️ Architecture

The application is based on **MVC (Model-View-Controller)** pattern:

```
Model       → org.example.student_spring.model.Student
View        → (Handled via API responses, suitable for web or Android)
Controller  → org.example.student_spring.controller.StudentController
Repository  → org.example.student_spring.repositories.StudentRepository
```

---

## 🧠 Technologies Used

| Layer            | Technology      |
| :--------------- | :-------------- |
| **Language**     | Kotlin          |
| **Framework**    | Spring Boot     |
| **Database**     | MySQL           |
| **ORM**          | Spring Data JPA |
| **Build Tool**   | Gradle          |
| **Architecture** | MVC             |

---

## 📁 Project Structure

```
student_spring/
│
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── org/example/student_spring/
│   │   │       ├── controller/StudentController.kt
│   │   │       ├── model/Student.kt
│   │   │       └── repositories/StudentRepository.kt
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   └── test/
│
├── build.gradle.kts
└── README.md
```

---

## 🚀 API Endpoints

### 👩‍🎓 Get All Students

`GET /students`
**Response:**

```json
[
  {
    "id": 1,
    "name": "Mohammad Omidi",
    "course": "Android",
    "score": 20
  }
]
```

---

### ➕ Add a Student

`POST /students`
**Request Body:**

```json
{
  "name": "Mohammad Omidi",
  "course": "Android",
  "score": 17
}
```

**Response:**

```
Student inserted successfully
```

---

### ✏️ Update a Student

`PUT /students/updating/{id}`
**Request Body:**

```json
{
  "name": "Mohammad Omidi",
  "course": "Math",
  "score": 20
}
```

**Response:**

```
Student updated successfully
```

---

### ❌ Delete a Student

`DELETE /students/deleting{id}`
**Response:**

```
{id}
```

---

## 💾 Database Configuration

Add your **MySQL configuration** inside `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Running the Project

1. **Clone this repository**

   ```bash
   git clone https://github.com/omidiDeveloper/student_spring.git
   ```
2. **Navigate to the project directory**

   ```bash
   cd student_spring
   ```
3. **Build the project**

   ```bash
   ./gradlew build
   ```
4. **Run the Spring Boot application**

   ```bash
   ./gradlew bootRun
   ```

---

## 📸 Screenshots

<img width="431" height="901" alt="image" src="https://github.com/user-attachments/assets/ff8c20ac-94f4-480c-b22e-fa6e72e539c2" /> <img width="454" height="935" alt="image" src="https://github.com/user-attachments/assets/0b94a19e-e0a5-42d9-b4b0-9ebaaafdedaf" /> <img width="447" height="929" alt="image" src="https://github.com/user-attachments/assets/0cd26518-414a-4d45-bb7b-d909c78f4a59" /> <img width="443" height="893" alt="image" src="https://github.com/user-attachments/assets/4e7214cd-9f1f-472d-8b2d-a52008ca05bf" />





---

## 📜 License

This project is open source and available under the **MIT License**.
Feel free to use and modify it for educational or commercial purposes.

---

## 👨‍💻 Author

**Mohammad Omidi**

-📧 [OmidiKotlin@gmail.com](mailto:OmidiKotlin@gmail.com) </br>
-💻 [GitHub: @omidiDeveloper](https://github.com/omidiDeveloper) </br>
-🔗 [LinkedIn: Mohammad Omidi Zadeh](https://www.linkedin.com/in/mohammad-omidi-zadeh-948740263) </br>

