package com.plcoding.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.plcoding.multipleroomtables.entities.Director
import com.plcoding.multipleroomtables.entities.School

//1:1 relation
data class SchoolAndDirector(
    //The Embedded is the FIRST of the relation class name. So this is the parent table
    @Embedded // Room will take School fields to create a table
    val school: School,
    @Relation(
        parentColumn = "schoolName", //refers to school field
        entityColumn = "schoolName"//Foreign key of child table
    )
    val director: Director
)