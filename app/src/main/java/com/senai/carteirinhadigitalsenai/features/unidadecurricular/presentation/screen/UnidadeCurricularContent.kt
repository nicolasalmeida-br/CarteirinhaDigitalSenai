package com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadesCurriculares: List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares) { uc ->
            UnidadeCurricularCard(unidadeCurricular = uc)
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
        unidadesCurriculares = listOf(
            UnidadeCurricular(
                "1",
                "Programação Mobile",
                "Rafael Pinheiro Costa",
                8.5,
                9.0,
                8.75,
                2
            ),
            UnidadeCurricular(
                "2",
                "Banco de Dados",
                "Tércio Ribeiro",
                7.5,
                8.0,
                7.75,
                1
            )
        )
    )
}