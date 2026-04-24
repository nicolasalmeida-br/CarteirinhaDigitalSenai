package com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.senai.carteirinhadigitalsenai.R

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    CarteirinhaContent(
        nomeAluno = stringResource(R.string.nome_aluno),
        curso = stringResource(R.string.curso_aluno),
        turma = stringResource(R.string.turma_aluno),
        qrCodeContent = stringResource(R.string.qrcode_aluno),
        modifier = modifier,
        onVoltar = {
            navController.popBackStack()
        }
    )
}