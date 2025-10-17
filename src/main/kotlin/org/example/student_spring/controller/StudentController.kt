package org.example.student_spring.controller

import org.example.student_spring.model.Student
import org.example.student_spring.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class StudentController {

    @Autowired
    lateinit var studentRepository: StudentRepository


    @GetMapping("/students")
    fun getAllStudents(): ResponseEntity<MutableIterable<Student>> {
        val dataFromDatabase = studentRepository.findAll()
        return ResponseEntity.ok(dataFromDatabase)
    }


    @PostMapping("/students")
    fun insertStudent(@RequestBody student: Student) {
        studentRepository.save(student)
        ResponseEntity.ok("Student inserted successfully")
    }


    @PutMapping("students/updating/{id}")
    fun updateStudent(@PathVariable id: Long, @RequestBody student: Student) {
        val existingStudent = studentRepository.findById(id)

         if (existingStudent.isPresent) {
            val updatedStudent = existingStudent.get().apply {
                name = student.name
                course = student.course
                score = student.score
            }
            studentRepository.save(updatedStudent)
            ResponseEntity.ok("Student updated successfully")
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/students/deleting{id}")
    fun deleteStudent(@PathVariable("id") id: Long? ){
        studentRepository.deleteById(id!!)
        ResponseEntity.ok(id.toString())
    }

}
