package com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation

import com.senai.carteirinhadigitalsenai.features.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)