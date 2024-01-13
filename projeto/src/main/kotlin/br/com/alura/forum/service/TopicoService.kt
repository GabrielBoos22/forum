package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoDto
import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService (
    private var topicos: List<Topico> = ArrayList(),
    private var cursoService: CursoService,
    private var usuarioService: UsuarioService){
    fun listar(): List<Topico>{
        return topicos
    }

    fun buscarPorId(id: Long): Topico{
        return topicos.stream().filter({
                t -> t.id == id
        }).findFirst().get()
    }

    fun cadastrar(dto: NovoTopicoDto) {

        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idUsuario)
        ))
    }
}