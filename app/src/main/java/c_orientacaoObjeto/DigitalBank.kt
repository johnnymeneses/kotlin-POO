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


//Dataclass: Armazenar dados que uma vez inicializados, nao podemos mudá-lo | armazer o estado do objeto
data class Banco(
    val nome: String,
    val numero: Int
)


class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal) {}

    fun saque(valor: BigDecimal) {}
}

fun imprimeDadosPessoa() {
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


//


//CLASSES DE TESTE
fun testaBanco() {
    val digiOne = Banco("DigiOne", 123)
    val digiOne2 = Banco(numero = 12, nome = "DigiOne")

    val banco2 = digiOne.copy(nome = "Teste")

    println("${digiOne.nome} e ${digiOne.numero}")
    println("${digiOne2.nome} e ${digiOne2.numero}")
    println("${banco2.nome}")


}


//abstracao
//Uma classe abstrata nao pode ser implementada
abstract class Pess(
    open val nomePessoa: String,
    open val cpfPessoa: String
)

abstract class Funcc(
    val nomeFunc: String,
    val cpfFunc: String,
    val salarioFunc: Double
) : Pess(nomeFunc, cpfFunc) {

    protected abstract fun calculaAuxilio(): Double

    override fun toString(): String = """
        Nome: $nomeFunc
        CPF: $cpfFunc
        Salario: $salarioFunc
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()

}

class AnalistaDigital(nomeA: String, cpfA: String, salarioA: Double) :
    Funcc(nomeA, cpfA, salarioA) {

    override fun calculaAuxilio(): Double = salarioFunc * 0.1
}


class GerenteDigital(nomeG: String, cpfG: String, salarioG: Double) :
    Funcc(nomeG, cpfG, salarioG) {

    override fun calculaAuxilio(): Double  = salarioFunc * 0.3

}


fun imprimeDados(funcionario: Funcc) = println(funcionario.toString())

fun main() {

    val joao = AnalistaDigital("Joao", "123456", 500.0)
    val pedro = GerenteDigital("Pedro","456789",1000.0)

    imprimeDados(joao)
    imprimeDados(pedro)


}