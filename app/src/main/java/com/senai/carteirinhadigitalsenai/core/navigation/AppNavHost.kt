package com.senai.carteirinhadigitalsenai.core.navigation

import com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.HomeScreen
import com.senai.carteirinhadigitalsenai.features.auth.presentation.LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: AppNavController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {
        composable(route = Routes.Login.route) {
            LoginScreen( )
        }
        composable(route = Routes.Home.route) {
            HomeScreen( )
        }
    }
}