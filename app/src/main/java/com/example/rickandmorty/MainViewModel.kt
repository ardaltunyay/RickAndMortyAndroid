package com.example.rickandmorty

import androidx.lifecycle.ViewModel
import com.example.domain.model.Character
import com.example.domain.usecase.GetSingleCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getSingleCharacterUseCase: GetSingleCharacterUseCase
) : ViewModel() {

    fun deneme(): Character {
        return getSingleCharacterUseCase()
    }
}