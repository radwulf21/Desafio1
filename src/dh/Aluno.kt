package dh

class Aluno(override var nome: String, override var sobrenome: String, var codigo: Int) : Pessoa {


    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

    override fun toString(): String {
        return "{nome: ${this.nome}, sobrenome: ${this.sobrenome}, codigo: ${this.codigo}}"
    }
}