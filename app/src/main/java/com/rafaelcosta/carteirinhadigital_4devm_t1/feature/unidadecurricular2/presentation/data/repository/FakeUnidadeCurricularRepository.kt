package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.data.repository

import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository: UnidadeCurricularRepository {
    override suspend fun buscarUnidadeCurriculares(): Result<List<UnidadeCurricular>> {

        delay(1800)
            return Result.success(
                listOf(UnidadeCurricular(
                    id = "1",
                    nome = "Programação Mobile",
                    professor = "Rafael Costa",
                    nota1 = 10.0,
                    nota2 = 9.0,
                    media = 9.5,
                    faltas = 2
                ),
                    UnidadeCurricular(
                        id = "2",
                        nome = "Banco de Dados",
                        professor = "Mariana Silva",
                        nota1 = 8.5,
                        nota2 = 7.5,
                        media = 8.0,
                        faltas = 1
                    ),
                    UnidadeCurricular(
                        id = "3",
                        nome = "Desenvolvimento Web",
                        professor = "Carlos Souza",
                        nota1 = 9.0,
                        nota2 = 8.0,
                        media = 8.5,
                        faltas = 0
                    ),
                    UnidadeCurricular(
                        id = "4",
                        nome = "Engenharia de Software",
                        professor = "Fernanda Lima",
                        nota1 = 7.0,
                        nota2 = 8.5,
                        media = 7.75,
                        faltas = 3
                    ),
                    UnidadeCurricular(
                        id = "5",
                        nome = "UX/UI Design",
                        professor = "Juliana Rocha",
                        nota1 = 9.5,
                        nota2 = 9.0,
                        media = 9.25,
                        faltas = 1
                    )
            )
            )
    }
}