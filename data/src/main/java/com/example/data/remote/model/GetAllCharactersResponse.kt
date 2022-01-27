package com.example.data.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetAllCharactersResponse(
    @Json(name = "info")
    val info: GetAllCharactersInfo?,
    @Json(name = "results")
    val results: List<GetSingleCharacterResponse>?
)

data class GetAllCharactersInfo(
    @Json(name = "count")
    val count: Int?,
    @Json(name = "pages")
    val pages: Int?,
    @Json(name = "next")
    val next: String?,
    @Json(name = "prev")
    val prev: String?
)