package dh

class Curso(var nome: String, var codigo: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, var qtdMaxAlunos: Int) {
    val alunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

    override fun toString(): String {
        return "{nome: ${this.nome}, codigo: ${this.codigo}}"
    }
}