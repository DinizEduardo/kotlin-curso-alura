abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonifcacao: Double get() = salario * 0.1

}