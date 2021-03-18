class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override val bonifcacao: Double
        get() {
            return super.bonifcacao + salario + plr
        }

}