package c_orientacaoObjeto


class Pessoa {

    //Propriedades da classe
    var nome: String = "Johnny"

    var cpf: String = "123.456.789-00" //Campo Privado
        private set

//    inner class Endereco{                           //classe interna
//        var rua: String = "Rua show"
//    }


}

class Bank {}

class Account {}


fun main() {
    println("DigitalBank App")

    val cliente = Pessoa()

    cliente.nome = "Novo Nome"




    println(cliente) //Referencia do Objeto
    println(cliente.nome)
    println(cliente.cpf)
//    println(cliente.Endereco().rua)


}
