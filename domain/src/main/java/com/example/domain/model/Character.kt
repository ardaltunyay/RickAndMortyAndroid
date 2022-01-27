package com.example.domain.model

import com.example.domain.model.type.Gender
import com.example.domain.model.type.Status

data class Character(
    val id: Int,
    val name: String,
    val image: String,
    val species: String,
    val status: Status,
    val gender: Gender,
    val origin: CharacterLocation,
    val location: CharacterLocation
)

data class CharacterLocation(
    val id: Int,
    val name: String
)