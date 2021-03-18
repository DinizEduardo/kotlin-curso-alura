fun main() {
    println("Bem vindo ao banco")
    val contaEduardo = Conta("Eduardo", 7777)
    contaEduardo.deposita(100.0)


    val contaFran = Conta("Fran", 1111)
    contaFran.deposita(200.0)

    println(contaEduardo.titular)
    println(contaEduardo.numero)
    println(contaEduardo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if(valor > 0)
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

}
