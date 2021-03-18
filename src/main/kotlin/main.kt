fun main() {
    println("Bem vindo ao banco")

    val eduardo = Funcionario(
        nome = "Eduardo",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${eduardo.nome}")
    println("CPF: ${eduardo.cpf}")
    println("Salario: ${eduardo.salario}")
    println("Bonificacao: ${eduardo.bonifcacao()}")

}

