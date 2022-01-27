package com.example.domain.repository

import com.example.domain.model.Character

interface CharacterRepository {

    fun getSingleCharacter(): Character

    fun getAllCharacters()

}