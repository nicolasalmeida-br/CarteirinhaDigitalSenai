package com.senai.carteirinhadigitalsenai.features.home.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.senai.carteirinhadigitalsenai.core.designsystem.navigation.Routes
import com.senai.carteirinhadigitalsenai.features.home.presentation.components.HomeContent

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    HomeContent(
        modifier = modifier,
        onVoltar = {
            navController.popBackStack()
        },
        onIrParaCarteirinha = {
            navController.navigate(Routes.Carteirinha.route)
        }
    )
}