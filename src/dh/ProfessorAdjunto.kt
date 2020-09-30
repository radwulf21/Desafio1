package dh

class ProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, var qtdHorasMonitoria: Int) : Professor(nome, sobrenome, codigo) {
    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, " +
                "Tempo de Casa: ${this.tempoDeCasa}, " +
                "Código: ${this.codigo}, " +
                "Horas de Monitoria: ${this.qtdHorasMonitoria}}"
    }
}