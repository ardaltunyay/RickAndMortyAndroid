package com.example.data.repository

import com.example.data.remote.service.CharacterService
import com.example.domain.model.Character
import com.example.domain.model.CharacterLocation
import com.example.domain.model.type.Gender
import com.example.domain.model.type.Status
import com.example.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val characterService: CharacterService
) : CharacterRepository {
    override fun getSingleCharacter(): Character {

        val location = CharacterLocation(1, "")

        return Character(
            1,
            "Test",
            "image_url",
            "",
            Status.ALIVE,
            Gender.FEMALE,
            location,
            location
        )
    }

    override fun getAllCharacters() {

    }
}