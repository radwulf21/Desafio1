package dh

class Curso(var nome: String, var codigo: Int) {
    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

    override fun toString(): String {
        return "{nome: ${this.nome}, codigo: ${this.codigo}}"
    }
}