package com.senai.carteirinhadigitalsenai.app

import androidx.compose.runtime.Composable
import com.senai.carteirinhadigitalsenai.core.designsystem.theme.CarteirinhaDigitalSenaiTheme
import com.senai.carteirinhadigitalsenai.core.navigation.AppNavHost

@Composable
fun App() {
    CarteirinhaDigitalSenaiTheme {
        val navController = rememberAppNavController()

        AppNavHost(
            navController = navController
        )
    }
}