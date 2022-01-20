package com.example.domain.usecase

import com.example.domain.model.Character
import com.example.domain.repository.CharacterRepository
import javax.inject.Inject

class GetSingleCharacterUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {

    operator fun invoke(): Character {
        return characterRepository.getSingleCharacter()
    }

}