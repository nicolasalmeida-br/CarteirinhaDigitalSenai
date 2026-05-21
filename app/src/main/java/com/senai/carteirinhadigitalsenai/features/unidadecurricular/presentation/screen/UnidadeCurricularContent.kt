package com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.UnidadeCurricularEvent
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.UnidadeCurricularUiState
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    uiState: UnidadeCurricularUiState,
    onEvent: (UnidadeCurricularEvent) -> Unit
) {
    when {
        uiState.isLoading -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
                Text(
                    text = "Buscando unidades curriculares...",
                    modifier = Modifier.padding(top = 12.dp)
                )
            }
        }

        uiState.errorMessage != null -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = uiState.errorMessage,
                    color = MaterialTheme.colorScheme.error
                )
                Button(
                    onClick = { onEvent(UnidadeCurricularEvent.onTentarNovamenteClick) },
                    modifier = Modifier.padding(top = 12.dp)
                ) {
                    Text("Tentar novamente")
                }
            }
        }

        else -> {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(uiState.unidadesCurriculares) { unidade ->
                    UnidadeCurricularCard(unidadeCurricular = unidade)
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun UnidadeCurricularContentPreview() {
    UnidadeCurricularContent(
        uiState = UnidadeCurricularUiState(
            unidadesCurriculares = listOf(
                UnidadeCurricular(
                    id = "1",
                    nome = "Programação Mobile",
                    professor = "Rafael Pinheiro Costa",
                    nota1 = 8.5,
                    nota2 = 9.0,
                    media = 8.75,
                    faltas = 2
                ),
                UnidadeCurricular(
                    id = "2",
                    nome = "Banco de Dados",
                    professor = "Tércio Ribeiro",
                    nota1 = 7.5,
                    nota2 = 8.0,
                    media = 7.75,
                    faltas = 1
                )
            )
        ),
        onEvent = { }
    )
}