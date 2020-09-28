package dh

class Curso(var nome: String, var codigo: Int, var qtdMaxAlunos: Int) {
    // lateinit var professorTitular: ProfessorTitular
    // lateinit var professorAdjunto: ProfessorAdjunto
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        var contadorAlunos = 0
        alunosMatriculados.forEach { _ ->
            contadorAlunos++
        }

        return if (contadorAlunos == this.qtdMaxAlunos) {
            false
        } else {
            this.alunosMatriculados.add(umAluno)
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        this.alunosMatriculados.remove(umAluno)
    }

    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

//    override fun toString(): String {
//        return "Curso ${this.nome} \n " +
//                "-Código: ${this.codigo} \n " +
//                "-Professor(a) Titular: ${this.professorTitular.toString()} \n " +
//                "-Professor(a) Adjunto: ${this.professorAdjunto.toString()} \n " +
//                "-Quantidade máxima de alunos: ${this.qtdMaxAlunos} \n " +
//                "-Alunos Matriculados: ${this.alunosMatriculados}"
//    }
}