package com.example.data.repository

import com.example.domain.model.Character
import com.example.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor() : CharacterRepository {
    override fun getSingleCharacter(): Character {
        return Character(1, "Test", "image_url")
    }
}