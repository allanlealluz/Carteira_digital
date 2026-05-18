package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.data.repository

import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadeCurriculares(): Result<List<UnidadeCurricular>>
}