package com.example.data.remote.service

import com.example.data.remote.model.GetAllCharactersResponse
import com.example.data.remote.model.GetSingleCharacterResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character/{characterId}")
    suspend fun getSingleCharacter(@Path("characterId") characterId: String): GetSingleCharacterResponse

    @GET("character")
    suspend fun getAllCharacters(): GetAllCharactersResponse

}