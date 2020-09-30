package dh

class ProfessorTitular(nome: String, sobrenome: String, codigo: Int, var especialidade: String) : Professor(nome, sobrenome, codigo) {
    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, " +
                "Tempo de Casa: ${this.tempoDeCasa}, " +
                "Código: ${this.codigo}, " +
                "Especialidade: ${this.especialidade}}"
    }
}