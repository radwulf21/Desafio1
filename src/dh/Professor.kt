package dh

abstract class Professor(override var nome: String, override var sobrenome: String, var codigo: Int) : Pessoa {
    var tempoDeCasa = 0

    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }
}