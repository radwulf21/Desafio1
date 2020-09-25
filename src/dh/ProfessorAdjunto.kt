package dh

class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigo: Int, var qtdHorasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigo) {
    override fun toString(): String {
        return super.toString() + "Horas de Monitoria: ${this.qtdHorasMonitoria}."
    }
}