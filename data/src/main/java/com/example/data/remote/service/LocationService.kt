package com.example.data.remote.service

import com.example.data.remote.model.GetAllLocationsResponse
import com.example.data.remote.model.GetSingleLocationResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationService {

    @GET("location/{locationId}")
    suspend fun getSingleLocation(@Path("locationId") locationId: String): GetSingleLocationResponse

    @GET("location")
    suspend fun getAllLocations(): GetAllLocationsResponse
}