package com.plcoding.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.plcoding.multipleroomtables.entities.School
import com.plcoding.multipleroomtables.entities.Student

//1:n relation. One School is parent of many students
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",//PK of School
        entityColumn = "schoolName"//FK of Student
    )
    val students: List<Student>
)