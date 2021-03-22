package modelo

import modelo.Autenticavel

class SistemaInterno {

    fun entra(funcionario: Autenticavel, senha: Int){
        if(funcionario.autentica(senha)) {
            println("Bem vindo ao bytebank")
        }else {
            println("Falha na autenticacao")
        }


    }

}