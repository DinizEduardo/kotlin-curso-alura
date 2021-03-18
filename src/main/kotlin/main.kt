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

    println("Depositando na conta do Eduardo")
    contaEduardo.deposita(50.0)
    println(contaEduardo.saldo)

    println("Depositando na conta do Fran")
    contaFran.deposita(77.0)
    println(contaFran.saldo)

    println("Sacando de eduardo")
    contaEduardo.saca(90.0)
    println("Slado -> ${contaEduardo.saldo}")

    contaFran.saca(377.0)
    println("Slado -> ${contaFran.saldo}")

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if(this.saldo >= valor) {
            saldo -= valor
        }
    }
}
