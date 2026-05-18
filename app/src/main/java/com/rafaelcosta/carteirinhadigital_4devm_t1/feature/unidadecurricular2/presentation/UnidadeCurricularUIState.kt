package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation

import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.model.UnidadeCurricular

data class UnidadeCurricularUIState (
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)