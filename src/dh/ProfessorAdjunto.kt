package dh

class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigo: Int, var qtdHorasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigo) {
    override fun toString(): String {
        return "{nome: ${this.nome}, sobrenome: ${this.sobrenome}, tempoDeCasa: ${this.tempoDeCasa}, codigo: ${this.codigo}, especialidade: ${this.qtdHorasMonitoria}}"
    }
}