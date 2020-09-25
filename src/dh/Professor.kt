package dh

abstract class Professor(override var nome: String, override var sobrenome: String, var tempoDeCasa: Int, var codigo: Int) : Pessoa {
    override fun equals(other: Any?): Boolean {
        return other == this.codigo
    }

    override fun toString(): String {
        return "${this.nome} ${this.sobrenome} " +
                "com ${this.tempoDeCasa} anos de tempo de casa. " +
                "Código: ${this.codigo}. "
    }
}