package dh

fun main() {
    val professorTitular1 = ProfessorTitular("Raul", "Andrade", 2, 1, "Android")
    val professorAdjunto1 = ProfessorAdjunto("Letícia", "Duarte", 2, 2, 1)
    val aluno1 = Aluno("Lucas", "Evaldo", 1)
    val curso1 = Curso("Coders Mobile 2020", 1, professorTitular1, professorAdjunto1, 40)

    curso1.addAluno(aluno1)
    println(curso1.toString())
}