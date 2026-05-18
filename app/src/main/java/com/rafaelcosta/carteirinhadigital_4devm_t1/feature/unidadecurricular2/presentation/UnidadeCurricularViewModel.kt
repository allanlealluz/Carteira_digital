package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation

import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.data.repository.FakeUnidadeCurricularRepository
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.data.repository.UnidadeCurricularRepository

class UnidadeCurricularViewModel {
    private val repository: UnidadeCurricularRepository = FakeUnidadeCurricularRepository()
} : ViewModel(){

}