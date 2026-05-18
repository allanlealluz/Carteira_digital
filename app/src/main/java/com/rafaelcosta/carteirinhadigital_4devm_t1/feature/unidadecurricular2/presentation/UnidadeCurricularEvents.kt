package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation

sealed interface UnidadeCurricularEvents
{
    data object OnCarregarDados: UnidadeCurricularEvents

    data object OnTentarNovamenteClick: UnidadeCurricularEvents

    data object OnVoltarClick: UnidadeCurricularEvents
}