package com.senai.carteirinhadigitalsenai.features.unidadecurricular.data.repository

import com.senai.carteirinhadigitalsenai.features.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}