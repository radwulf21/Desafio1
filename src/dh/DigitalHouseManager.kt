package dh

import java.util.*

class DigitalHouseManager {
    // attr
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessoresAdjuntos = mutableListOf<ProfessorAdjunto>()
    val listaProfessoresTitulares = mutableListOf<ProfessorTitular>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()

    // --------------------------------------------------------------

    fun registrarCurso(nome: String, codigo: Int, qtdMaxAlunos: Int) {
        val curso = Curso(nome, codigo, qtdMaxAlunos)
        this.listaCursos.add(curso)
    }

    fun excluirCurso(codigo: Int) {
        for (i in 0 until this.listaCursos.size) {
            if (this.listaCursos[i].equals(codigo)) {
                this.listaCursos.remove(this.listaCursos[i])
                break
            }
        }
    }

    // --------------------------------------------------------------

    fun registrarProfAdjunto(nome: String, sobrenome: String, codigo: Int, qtdHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, codigo, qtdHoras)
        this.listaProfessoresAdjuntos.add(professorAdjunto)
    }

    fun registrarProfTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(nome, sobrenome, codigo, especialidade)
        this.listaProfessoresTitulares.add(professorTitular)
    }

    fun excluirProfAdjunto(codigo: Int) {
        for (i in 0 until this.listaProfessoresAdjuntos.size) {
            if (this.listaProfessoresAdjuntos[i].equals(codigo)) {
                this.listaProfessoresAdjuntos.remove(this.listaProfessoresAdjuntos[i])
                break
            }
        }
    }

    fun excluirProfTitular(codigo: Int) {
        for (i in 0 until this.listaProfessoresTitulares.size) {
            if (this.listaProfessoresTitulares[i].equals(codigo)) {
                this.listaProfessoresTitulares.remove(this.listaProfessoresTitulares[i])
                break
            }
        }
    }

    // --------------------------------------------------------------

    fun matricularAluno(nome: String, sobrenome: String, codigo: Int) {
        val aluno = Aluno(nome, sobrenome, codigo)
        this.listaAlunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var cursoRequerido: Curso? = null
        var alunoRequerido: Aluno? = null

        for (i in 0 until this.listaCursos.size) {
            if (this.listaCursos[i].equals(codigoCurso)) {
                cursoRequerido = this.listaCursos[i]
                break
            }
        }

        for (i in 0 until this.listaAlunos.size) {
            if (this.listaAlunos[i].equals(codigoAluno)) {
                alunoRequerido = this.listaAlunos[i]
                break
            }
        }

        if (cursoRequerido === null) {
            println("Curso não encontrado!")
            return
        } else if (alunoRequerido === null) {
            println("Aluno não encontrado!")
            return
        }

        if (!(cursoRequerido.adicionarUmAluno(alunoRequerido))) {
            println("Não há vagas disponíveis!")
            return
        }

        val data = Date()

        val matricula = Matricula(alunoRequerido, cursoRequerido, data)
        this.listaMatriculas.add(matricula)

        println("Matrícula realizada!")
    }

    // --------------------------------------------------------------

    fun alocarProfessores(codigoCurso: Int, codigoProfAdjunto: Int, codigoProfTitular: Int) {
        var cursoRequerido: Curso? = null
        var professorAdjuntoRequerido: ProfessorAdjunto? = null
        var professorTitularRequerido: ProfessorTitular? = null

        for (i in 0 until this.listaCursos.size) {
            if (this.listaCursos[i].equals(codigoCurso)) {
                cursoRequerido = this.listaCursos[i]
                break
            }
        }

        for (i in 0 until this.listaProfessoresAdjuntos.size) {
            if (this.listaProfessoresAdjuntos[i].equals(codigoProfAdjunto)) {
                professorAdjuntoRequerido = this.listaProfessoresAdjuntos[i]
                break
            }
        }

        for (i in 0 until this.listaProfessoresTitulares.size) {
            if (this.listaProfessoresTitulares[i].equals(codigoProfTitular)) {
                professorTitularRequerido = this.listaProfessoresTitulares[i]
                break
            }
        }

        when {
            cursoRequerido === null -> {
                println("Curso não encontrado!")
                return
            }
            professorAdjuntoRequerido === null -> {
                println("Professor Adjunto não encontrado!")
                return
            }
            professorTitularRequerido === null -> {
                println("Professor Titular não encontrado!")
                return
            }
        }

        cursoRequerido?.professorAdjunto = professorAdjuntoRequerido
        cursoRequerido?.professorTitular = professorTitularRequerido

        println("Professores alocados no curso ${cursoRequerido?.nome}!")
    }

    // --------------------------------------------------------------

    fun consultarCurso(codigoAluno: Int) {
        for (i in 0 until this.listaCursos.size) {
            for (j in 0 until this.listaCursos[i].alunosMatriculados.size) {
                if (this.listaCursos[i].alunosMatriculados[j].equals(codigoAluno)) {
                    println("Você está matriculado no curso ${this.listaCursos[i].nome}.")
                    return
                }
            }
        }
        
        println("Não encontramos o seu código")
    }
}