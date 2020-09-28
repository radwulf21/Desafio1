package dh

import java.util.*

class Matricula(var aluno: Aluno, var curso: Curso, var dataMatricula: Date) {
    override fun toString(): String {
        return "O aluno ${this.aluno.nome} ${this.aluno.sobrenome} " +
                "de código ${this.aluno.codigo}, " +
                "foi matriculado no curso ${this.curso.nome} " +
                "em ${this.dataMatricula}. "
    }
}