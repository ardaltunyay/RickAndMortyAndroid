package com.example.data.remote.service

import com.example.data.remote.model.GetAllEpisodesResponse
import com.example.data.remote.model.GetSingleEpisodeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface EpisodeService {

    @GET("episode/{episodeId}")
    suspend fun getSingleEpisode(@Path("episodeId") episodeId: String): GetSingleEpisodeResponse

    @GET("episode")
    suspend fun getAllEpisodes(): GetAllEpisodesResponse
}