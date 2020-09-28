package dh

import java.util.*

fun main() {
    var data = Date()

    val sistema = DigitalHouseManager()

    sistema.registrarCurso("Coders Mobile 2020", 1, 30)
    sistema.registrarCurso("Coders Java 2020", 2, 30)
    sistema.excluirCurso(1)
    println(sistema.listaCursos)
}