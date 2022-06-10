package c_orientacaoObjeto


class Pessoa{
    var nome: String = "Johnny"
    var cpf: String = "123.456.789-00"
}



fun main() {
    println("DigitalBank")

    val cliente = Pessoa()

    println(cliente.nome)
    println(cliente.cpf)


}

//Classe publica e Privada
//