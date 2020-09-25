package dh

class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigo: Int, var especialidade: String) : Professor(nome, sobrenome, tempoDeCasa, codigo) {
    override fun toString(): String {
        return "{nome: ${this.nome}, sobrenome: ${this.sobrenome}, tempoDeCasa: ${this.tempoDeCasa}, codigo: ${this.codigo}, especialidade: ${this.especialidade}}"
    }
}