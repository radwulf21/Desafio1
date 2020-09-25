package dh

fun main() {
    val professorTitular = ProfessorTitular("Raul", "Andrade", 2, 1, "Android")
    val professorAdjunto = ProfessorAdjunto("Letícia", "Duarte", 2, 2, 2)
    val aluno = Aluno("Lucas", "Evaldo", 1)

    println(professorTitular.toString())
    println(professorAdjunto.toString())
    println(aluno.toString())
}