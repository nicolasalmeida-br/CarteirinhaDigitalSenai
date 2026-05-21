package com.senai.carteirinhadigitalsenai.features.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object onTentarNovamenteClick : UnidadeCurricularEvent
    data object onVoltarClick : UnidadeCurricularEvent
}