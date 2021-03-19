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

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234567)
    sistema.entra(diretor, 123456)
}