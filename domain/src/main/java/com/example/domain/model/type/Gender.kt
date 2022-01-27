package com.example.domain.model.type

sealed class Gender(val value: String) {
    object FEMALE : Gender("Female")
    object MALE : Gender("Male")
    object GENDERLESS : Gender("Genderless")
    object UNKNOWN : Gender("Unknown")
}