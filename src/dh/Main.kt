package dh

fun main() {
    val sistema = DigitalHouseManager()

    sistema.registrarCurso("Coders Mobile 2020", 1, 30)
    sistema.registrarCurso("Coders Java 2020", 2, 30)

    sistema.registrarProfAdjunto("Vitória", "Gonçalves", 1, 2)
    sistema.registrarProfTitular("Carlos", "Adão", 1, "Kotlin")

    sistema.matricularAluno("Raul", "Andrade", 1)
    sistema.matricularAluno("Letícia", "Duarte", 2)
    sistema.matricularAluno(1, 1)
    sistema.matricularAluno(2, 1)

    sistema.alocarProfessores(1, 1, 1)

    println(sistema.listaCursos[0])

}