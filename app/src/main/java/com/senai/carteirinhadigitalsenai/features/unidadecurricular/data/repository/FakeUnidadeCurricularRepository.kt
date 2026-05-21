package com.senai.carteirinhadigitalsenai.features.unidadecurricular.data.repository

import com.senai.carteirinhadigitalsenai.features.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository {
    override suspend fun buscarUnidadesCurriculares() : Result<List<UnidadeCurricular>> {
        delay(1000)

        return Result.success(
            listOf(
                UnidadeCurricular(id = "1", nome = "Programação Mobile", professor = "Rafael Pinheiro Costa", nota1 = 8.5, nota2 = 9.0, media = 8.75, faltas = 2),
                UnidadeCurricular(id = "2", nome = "Banco de Dados", professor = "Tércio Ribeiro", nota1 = 7.5, nota2 = 8.0, media = 7.75, faltas = 1),
                UnidadeCurricular(id = "3", nome = "Engenharia de Software", professor = "Maria Silva", nota1 = 9.0, nota2 = 9.5, media = 9.25, faltas = 0),
                UnidadeCurricular(id = "4", nome = "Redes de Computadores", professor = "João Souza", nota1 = 6.5, nota2 = 7.0, media = 6.75, faltas = 3),
                UnidadeCurricular(id = "5", nome = "Sistemas Operacionais", professor = "Ana Pereira", nota1 = 8.0, nota2 = 8.5, media = 8.25, faltas = 1),
                UnidadeCurricular(id = "6", nome = "Inteligência Artificial", professor = "Carlos Oliveira", nota1 = 9.5, nota2 = 9.0, media = 9.25, faltas = 0),
                UnidadeCurricular(id = "7", nome = "Desenvolvimento Web", professor = "Fernanda Lima", nota1 = 7.0, nota2 = 7.5, media = 7.25, faltas = 4),
                UnidadeCurricular(id = "8", nome = "Segurança da Informação", professor = "Ricardo Santos", nota1 = 8.5, nota2 = 9.0, media = 8.75, faltas = 2)
            )
        )
    }
}