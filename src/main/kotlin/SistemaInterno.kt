class SistemaInterno {

    fun entra(funcionario: FuncionarioAdmin, senha: Int){
        if(funcionario.autentica(senha)) {
            println("Bem vindo ao bytebank")
        }else {
            println("Falha na autenticacao")
        }


    }

}