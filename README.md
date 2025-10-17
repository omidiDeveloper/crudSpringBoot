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

✅ Built with **Spring Boot** and **Kotlin**</br>
✅ Follows **MVC Architecture**</br>
✅ CRUD operations for students</br>
✅ Uses **Spring Data JPA** for database management</br>
✅ Supports **MySQL** integration</br>
✅ Well-structured RESTful API design</br>
✅ Ready for Android or Web integration</br>

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

<img width="439" height="980" alt="image" src="https://github.com/user-attachments/assets/5f94723c-e83f-4bcb-a197-bfeb3d6fba17" />  <img width="449" height="939" alt="image" src="https://github.com/user-attachments/assets/5863ba3b-81f3-49f3-9500-6d56a05114df" />  <img width="458" height="928" alt="image" src="https://github.com/user-attachments/assets/c74e45fa-4163-462a-882f-021ab8247bab" />  <img width="443" height="955" alt="image" src="https://github.com/user-attachments/assets/f3adbdc6-122a-4657-9e43-76b713b31027" />



---

## 📜 License

This project is open source and available under the **MIT License**.
Feel free to use and modify it for educational or commercial purposes.

---

## 👨‍💻 Author

**Mohammad Omidi**

📍 Android Developer | Kotlin & Spring Boot Enthusiast

-📧 [OmidiKotlin@gmail.com](mailto:OmidiKotlin@gmail.com) </br>
-💻 [GitHub: @omidiDeveloper](https://github.com/omidiDeveloper) </br>
-🔗 [LinkedIn: Mohammad Omidi Zadeh](https://www.linkedin.com/in/mohammad-omidi-zadeh-948740263) </br>

