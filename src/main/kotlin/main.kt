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

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
    for (i in 5 downTo 1 step 1) {
//        if(i == 3) break;
        // var -> pode mudar | val -> não pode mudar
        val titular: String = "Eduardo $i" // OBRIGA INICIALIZAR O VALOR
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("------------------")
        testaConcidoces(saldo)
    }
}

fun testaConcidoces(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")

        saldo == 0.0 -> println("Conta neutra")

        else -> println("Conta negativa")
    }
}