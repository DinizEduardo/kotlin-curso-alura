package modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonifcacao: Double
        get() {
            return salario * 0.1
        }

}