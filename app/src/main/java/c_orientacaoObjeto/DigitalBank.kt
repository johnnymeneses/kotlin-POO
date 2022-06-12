package c_orientacaoObjeto

import java.math.BigDecimal


class Pessoa {

    //Propriedades da classe
    var nome: String = "Johnny"
    var cpf: String = "123.456.789-00" //Campo Privado
        private set

    fun alteraCPF(novoCpf: String) {
        cpf = novoCpf
    }

//    inner class Endereco{                           //classe interna
//        var rua: String = "Rua show"
//    }


    fun uneNomeCPF() = "$nome e $cpf"


}

class Bank {}



class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal) {}

    fun saque(valor: BigDecimal) {}
}




fun main() {
    println("DigitalBank App")

    val cliente = Pessoa()

    cliente.nome = "Novo Nome"

    cliente.alteraCPF("123456789")

    println(cliente) //Referencia do Objeto
    println(cliente.nome)
    println(cliente.cpf)

    println(cliente.uneNomeCPF())


//    println(cliente.Endereco().rua)


}


//Dataclass: Armazenar dados que uma vez inicializados, nao podemos mudá-lo | armazer o estado do objeto