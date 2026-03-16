package com.senai.carteiradigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

import com.senai.carteiradigital.core.designsystem.navigation.AppNavHost
import com.senai.carteiradigital.core.designsystem.theme.theme.CarteirinhaDigitalTheme

@Composable
fun App() {
    CarteirinhaDigitalTheme () {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}