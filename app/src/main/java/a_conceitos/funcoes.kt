package a_conceitos

//Funções

//Função é uma pequena parte do programa que possui uma responsabilidade específica e pode ser usada quando necessário

//Retornos de Função:
//Unit: O tipo Unit diz que uma função não possui retorno. A função executa seu corpo e termina sua execução

//Double, FLoat, Long, Int, Short, Byte, Boolean, String e Char**
//Uma função também pode executar seu corpo e fornecer uma resposta para seu chamador. Os mesmos tipos que são usados para declaração de variáveis, servem como retorno de funções

//Instâncias de classes**
//Uma função é capaz de retornar um tipo de dado resultante da instâqncia de uma classe


fun soma(a: Int, b: Int): Int {
    return a + b
}

fun soma2(a: Int, b: Int): Int = a + b

fun max(a: Int, b: Int) {
    var soma = a + b
}

// Hello World
fun printNome(nome: String) {
    println("Ola $nome")
}

//Função com retorno direto
fun areaTerreno(a: Int, b: Int): Int = a * b
//areaTerreno(5,6)


//Função com parametro
fun qtdeDias(dia: Int, mes: Int) {
    var total = ((mes - 1) * 30) + dia
    println("Já se passaram $total dias")
}
//   qtdeDias(5, 1)

fun divisao(a: Float, b: Float) = a / b




//FUNÇÕES STRING

fun str1(){
    val str = "Programação Kotlin."
    val str2 = "A                               B"
    println("Tamanho da String: ${str.length}")
    println("Posição 4: ${str[4]}")
    println("Começa com Pro ${str.startsWith("Pro")}") //retorno booleano
    println("Termina com ABC ${str.endsWith("ABC")}")//retorno booleano
    println("Posicao 2 a 4 ${str.substring(2,4)}")
    println("Trocando a por z ${str.replace("a","z")}")
    println("Tudo minusculo ${str.lowercase()}")
    println("Tudo maisculo ${str.uppercase()}")
    println("Sem espaços em branco ${str2.trim()}") //funcionou mas não funcionou

}


