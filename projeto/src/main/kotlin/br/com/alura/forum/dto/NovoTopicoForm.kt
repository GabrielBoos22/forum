package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message="O título não pode ser inválido") @field:Size(min = 5, max = 50, message = "O titulo necessita ter de 5 a 50 caracteres") val titulo: String,
    @field:NotEmpty(message="A mensagem não pode ser inválido") val mensagem: String,
    @field:NotNull(message="É preciso referenciar o curso") val idCurso: Long,
    @field:NotNull(message="É preciso referenciar o autor") val idUsuario: Long,
)

