package com.example.rickandmorty.ui.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.rickandmorty.navigation.Screen
import kotlinx.coroutines.currentCoroutineContext

@Composable
fun HomeScreen(
    navController: NavController
) {
    HomeScreen()
}

@Composable
private fun HomeScreen() {

    Text(text = "Home Screen")
}