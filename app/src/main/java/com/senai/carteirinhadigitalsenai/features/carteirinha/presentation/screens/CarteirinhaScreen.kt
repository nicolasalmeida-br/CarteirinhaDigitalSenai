package com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    CarteirinhaContent(
        nomeAluno = "Nicolas Luis Moura de Almeida",
        curso = "Técnico em Desenvolvimento de Sistemas",
        turma = "4DEVM-A",
        qrCodeContent = "90000000001382264860",
        modifier = modifier,
        onVoltar = {
            navController.popBackStack()
        }
    )
}