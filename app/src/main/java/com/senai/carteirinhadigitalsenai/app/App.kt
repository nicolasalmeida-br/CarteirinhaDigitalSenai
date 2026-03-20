package com.senai.carteirinhadigitalsenai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigitalsenai.core.designsystem.themes.CarteirinhaDigitalSenaiTheme
import com.senai.carteirinhadigitalsenai.core.designsystem.navigation.AppNavHost

@Composable
fun App() {
    CarteirinhaDigitalSenaiTheme() {
        val navController = rememberNavController()

        AppNavHost(
            navController = navController,
        )
    }
}