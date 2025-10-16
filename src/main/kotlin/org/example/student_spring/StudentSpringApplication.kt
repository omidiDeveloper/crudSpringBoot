package org.example.student_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class StudentSpringApplication

fun main(args: Array<String>) {
    runApplication<StudentSpringApplication>(*args)
}
