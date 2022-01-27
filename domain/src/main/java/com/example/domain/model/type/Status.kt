package com.example.domain.model.type

sealed class Status(val value: String) {
    object ALIVE : Status("Alive")
    object DEAD : Status("Dead")
    object UNKNOWN : Status("Unknown")
}
