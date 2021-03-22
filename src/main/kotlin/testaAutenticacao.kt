fun testeDeAutenticacao() {
    val gerente = Gerente(
        nome = "Eduardo",
        cpf = "111.111.111-11",
        salario = 5000.0,
        senha = 123456
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "111.111.111-11",
        salario = 5000.0,
        senha = 123456,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "11111111111",
        senha = 123456
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234567)
    sistema.entra(diretor, 123456)
    sistema.entra(cliente, 123456)
}