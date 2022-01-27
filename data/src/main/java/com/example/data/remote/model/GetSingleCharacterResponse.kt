package com.example.data.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetSingleCharacterResponse(
    @Json(name = "id")
    val id: Int?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "species")
    val species: String?,
    @Json(name = "type")
    val type: String?,
    @Json(name = "gender")
    val gender: String?,
    @Json(name = "origin")
    val origin: GetSingleCharacterOriginResponse?,
    @Json(name = "location")
    val location: GetSingleCharacterLocationResponse?,
    @Json(name = "image")
    val image: String?,
    @Json(name = "episode")
    val episode: List<String>?,
    @Json(name = "url")
    val url: String?,
    @Json(name = "created")
    val created: String?
)

data class GetSingleCharacterOriginResponse(
    @Json(name = "name")
    val name: String?,
    @Json(name = "url")
    val url: String?
)

data class GetSingleCharacterLocationResponse(
    @Json(name = "name")
    val name: String?,
    @Json(name = "url")
    val url: String?
)