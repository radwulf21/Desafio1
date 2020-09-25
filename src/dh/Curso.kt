package dh

class Curso(var nome: String, var codigo: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, var qtdMaxAlunos: Int) {
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun addAluno(vararg alunos: Aluno) {
        this.alunosMatriculados.addAll(alunos)
    }

    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

    override fun toString(): String {
        return "CURSO \n " +
                "-Código: ${this.codigo} \n " +
                "-Nome: ${this.nome}. \n " +
                "-Professor(a) Titular: ${this.professorTitular.toString()} \n " +
                "-Professor(a) Adjunto: ${this.professorAdjunto.toString()} \n " +
                "-Quantidade máxima de alunos: ${this.qtdMaxAlunos} \n " +
                "-Alunos Matriculados: ${this.alunosMatriculados}"
    }
}