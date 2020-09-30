package dh

fun main() {
    val sistema = DigitalHouseManager()

    //-----------------------------------------

    sistema.registrarProfAdjunto("Vitória", "Gonçalves", 1, 1)
    sistema.registrarProfAdjunto("João", "Felipe", 2, 1)

    sistema.registrarProfTitular("Carlos", "Adão", 1, "Kotlin")
    sistema.registrarProfTitular("Jéssica", "Corrêa", 2, "Android")

    //-----------------------------------------

    sistema.registrarCurso("Full Stack", 20001, 3)
    sistema.registrarCurso("Android", 20002, 2)

    //-----------------------------------------

    sistema.alocarProfessores(20001, 1, 1)
    sistema.alocarProfessores(20002, 2, 2)

    //-----------------------------------------

    sistema.matricularAluno("Raul", "Andrade", 1)
    sistema.matricularAluno("Letícia", "Duarte", 2)

    sistema.matricularAluno("Neander", "Wendel", 3)
    sistema.matricularAluno("Anderson", "Barbosa", 4)
    sistema.matricularAluno("Abel", "Max", 5)

    //-----------------------------------------

    sistema.matricularAluno(1, 20001)
    sistema.matricularAluno(2, 20001)

    sistema.matricularAluno(3, 20002)
    sistema.matricularAluno(4, 20002)
    sistema.matricularAluno(5, 20002)

    //-----------------------------------------

    sistema.consultarCurso(1)
}