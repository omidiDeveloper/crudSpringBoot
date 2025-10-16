package org.example.student_spring.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Student(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long?,
    var name : String,

    var course : String,
    var score : Int

){
    constructor():this(0, "" , "" , -1)
}
