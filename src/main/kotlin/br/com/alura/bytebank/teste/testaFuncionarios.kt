import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val eduardo = Analista(
        nome = "Eduardo",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${eduardo.nome}")
    println("CPF: ${eduardo.cpf}")
    println("Salario: ${eduardo.salario}")
    println("Bonificacao: ${eduardo.bonifcacao}")

    val fran = Gerente(
        nome = "fran",
        cpf = "111.111.111-11",
        salario = 5000.0,
        senha = 123456
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificacao: ${fran.bonifcacao}")

    if (fran.autentica(123456)) {
        println("Certo")
    } else {
        println("Falha")
    }


    val gui = Diretor(
        nome = "Guilherme",
        cpf = "111.111.111-11",
        salario = 50000.0,
        senha = 123456,
        plr = 500.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificacao: ${gui.bonifcacao}")
    println("PLR: ${gui.plr}")

    val maria = Analista(
        nome = "maria",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificacao: ${maria.bonifcacao}")


    val calculadora = CalculadoraBonificacao();
    calculadora.registra(eduardo)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total bonificacao: ${calculadora.total}")
}