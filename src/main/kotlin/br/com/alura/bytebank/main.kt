import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco()
    val endereco2 = Endereco()
    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(endereco2.hashCode())

    println(endereco.toString())
    println(endereco2.toString())
}


