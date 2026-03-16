package com.senai.carteiradigital.feature.auth.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.senai.carteiradigital.core.designsystem.navigation.Routes
import com.senai.carteiradigital.core.designsystem.theme.theme.CarteirinhaDigitalTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }


    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LoginContent(
            login = login,
            senha = senha,
            onLoginChange = { login = it },
            onSenhaChange = { senha = it },
            onLoginClick = {
                navController.navigate(
                    Routes.Home.route
                )
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreviewClaro() {
    CarteirinhaDigitalTheme(darkTheme = false) {
        LoginScreen(navController = rememberNavController())
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreviewEscuro() {
    CarteirinhaDigitalTheme(darkTheme = true) {
        LoginScreen(navController = rememberNavController())
    }
}