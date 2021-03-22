import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val eduardo = Cliente(nome = "Eduardo", cpf = "", senha=1)
    val contaCorrente = ContaCorrente(
        titular = eduardo,
        numero = 1111
    )

    val fran = Cliente(nome = "Fran", cpf = "", senha=1)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 2222
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo apos transferir para poupanca")
    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo apos transferir para corrente")
    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")
}
