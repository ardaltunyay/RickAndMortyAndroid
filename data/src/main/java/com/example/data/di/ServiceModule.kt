package com.example.data.di

import com.example.data.remote.service.CharacterService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    fun provideCharacterService(
        retrofit: Retrofit
    ): CharacterService = retrofit.create(CharacterService::class.java)
}