package com.senai.carteiradigital.feature.home.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.senai.carteiradigital.core.designsystem.navigation.Routes
import com.senai.carteiradigital.feature.auth.presentation.screen.LoginContent

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
){
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        HomeContent(
            onHomeClick = {
                navController.navigate(
                    Routes.Carteirinha.route
                )
            }
        )
    }
}