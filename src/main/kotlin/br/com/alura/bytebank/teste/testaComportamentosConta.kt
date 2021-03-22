import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val eduardo = Cliente(nome = "Eduardo", cpf = "111", senha=1)

    val contaEduardo = ContaCorrente(titular = eduardo, numero = 7777)
    contaEduardo.deposita(100.0)


    val fran = Cliente(nome = "fran", cpf = "222", senha=1)
    val contaFran = ContaPoupanca(numero = 1111, titular = fran)
    contaFran.deposita(200.0)

    println(contaEduardo.titular.nome)
    println(contaEduardo.titular.cpf)
    println(contaEduardo.titular.senha)
    println(contaEduardo.numero)
    println(contaEduardo.saldo)
    println()
    println(contaFran.titular.nome)
    println(contaFran.titular.cpf)
    println(contaFran.titular.senha)
    println(contaFran.numero)
    println(contaFran.saldo)

    if (contaFran.transfere(destino = contaEduardo, valor = 10.0)) {
        println("Transferiu")
    } else {
        println("Não transferiu")
    }
}