package dh

class DigitalHouseManager {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigo: Int, qtdMaxAlunos: Int) {
        val curso = Curso(nome, codigo, qtdMaxAlunos)
        listaCursos.add(curso)
    }

    fun excluirCurso(codigo: Int) {
        for (i in 0 until this.listaCursos.size) {
            if (this.listaCursos[i].equals(codigo)) {
                this.listaCursos.remove(this.listaCursos[i])
                break
            }
        }
    }
}