fun main() {
    println("Bem vindo ao banco")
    val contaEduardo = Conta()
    contaEduardo.titular = "Eduardo"
    contaEduardo.numero = 7777
    contaEduardo.saldo = 100.0


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1151
    contaFran.saldo = 300.0

    println(contaEduardo.titular)
    println(contaEduardo.numero)
    println(contaEduardo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("transferencia da conta da fran para Eduardo")
    if(contaFran.transfere(301.0, contaEduardo)) {
        println("Transferiu!")
        println("Saldo eduardo ${contaEduardo.saldo}")
        println("Saldo fran ${contaFran.saldo}")
    }else {
        println("Falhou")
    }

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

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
            destino.saldo += valor
            return true
        }

        return false
    }
}
