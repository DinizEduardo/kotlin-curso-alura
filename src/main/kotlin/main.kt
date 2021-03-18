fun main(){
    println("Bem vindo ao banco")
    // var -> pode mudar | val -> não pode mudar
    val titular: String = "Eduardo" // OBRIGA INICIALIZAR O VALOR
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100.0
    saldo += 200

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo da conta: $saldo")
}