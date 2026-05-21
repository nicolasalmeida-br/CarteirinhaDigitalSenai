package com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.UnidadeCurricularEvent
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.UnidadeCurricularViewModel

@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
    viewModel: UnidadeCurricularViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    UnidadeCurricularContent(
        uiState = uiState,
        onEvent = { event ->
            when (event) {
                is UnidadeCurricularEvent.onVoltarClick -> viewModel.onEvent(event)
                else -> viewModel.onEvent(event)
            }
        }
    )

}