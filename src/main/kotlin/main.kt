fun main() {
    println("Bem vindo ao banco")
    val contaEduardo = Conta()
    contaEduardo.titular = "Eduardo"
    contaEduardo.numero = 7777
    contaEduardo.setSaldo(100.0)


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1151
    contaFran.setSaldo(200.0)

    println(contaEduardo.titular)
    println(contaEduardo.numero)
    println(contaEduardo.getSaldo())
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

}


class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

    fun getSaldo(): Double {
        return saldo;
    }

    fun setSaldo(valor: Double) {
        if(valor > 0)
            this.saldo = valor;
    }
}
