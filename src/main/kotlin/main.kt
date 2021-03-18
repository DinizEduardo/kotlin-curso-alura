fun main() {
    println("Bem vindo ao banco")

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