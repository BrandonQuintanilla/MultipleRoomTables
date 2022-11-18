package com.plcoding.multipleroomtables.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
    @PrimaryKey(autoGenerate = false)//true  is default for Int PK
    val directorName: String,
    val schoolName: String
)