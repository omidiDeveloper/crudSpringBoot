    package org.example.student_spring.repositories

    import org.example.student_spring.model.Student
    import org.springframework.data.jpa.repository.JpaRepository
    import org.springframework.data.repository.CrudRepository
    import org.springframework.stereotype.Repository

    @Repository
    interface StudentRepository : CrudRepository<Student, Long?> {
    }