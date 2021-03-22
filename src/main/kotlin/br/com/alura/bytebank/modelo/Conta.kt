package br.com.alura.bytebank.modelo

var total = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if(valor > 0)
            this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

}