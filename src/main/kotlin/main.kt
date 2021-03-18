fun main() {
    println("Bem vindo ao banco")
    val contaEduardo = Conta(titular = "Eduardo", numero =  7777)
    contaEduardo.deposita(100.0)


    val contaFran = Conta(numero = 1111, titular = "Fran")
    contaFran.deposita(200.0)

    println(contaEduardo.titular)
    println(contaEduardo.numero)
    println(contaEduardo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    if(contaFran.transfere(destino =  contaEduardo, valor = 10.0)){
        println("Transferiu")
    }else {
        println("Não transferiu")
    }

}

class Conta(val titular: String, val numero: Int) {
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
