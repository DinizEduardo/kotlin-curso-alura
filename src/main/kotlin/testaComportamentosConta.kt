fun testaComportamentosConta() {
    val contaEduardo = Conta(titular = "Eduardo", numero = 7777)
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

    if (contaFran.transfere(destino = contaEduardo, valor = 10.0)) {
        println("Transferiu")
    } else {
        println("Não transferiu")
    }
}