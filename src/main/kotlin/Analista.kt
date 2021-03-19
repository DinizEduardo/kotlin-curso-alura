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
            return super.bonifcacao + salario * 0.1
        }

}