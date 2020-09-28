package dh

class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigo: Int, var especialidade: String) : Professor(nome, sobrenome, tempoDeCasa, codigo) {
    override fun toString(): String {
        return super.toString() + "Sua especialidade é ${this.especialidade}."
    }
}