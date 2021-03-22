import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val endereco2 = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    println(endereco.equals(endereco2))

    println(endereco.hashCode())
    println(endereco2.hashCode())

    println(endereco.toString())
    println(endereco2.toString())
}


