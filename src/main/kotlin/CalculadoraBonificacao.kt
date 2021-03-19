class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonifcacao
    }

    fun registra(gerente: Gerente) {
        this.total += gerente.bonifcacao
    }

    fun registra(diretor: Diretor) {
        this.total += diretor.bonifcacao
    }


}