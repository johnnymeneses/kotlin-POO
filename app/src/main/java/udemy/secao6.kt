package udemy

//Seção 6: Funções

fun main() {

//    println(sum1(4, 6))
//    println(sum2(10, 6))
//    helloWorld()
//    println(divisao(14f, 2f))

    str1()

}

//FUNÇÕES EM UMA UNICA LINHA

fun sum1(a: Int, b: Int): Int {
    return (a + b)
}

fun sum2(a: Int, b: Int) = (a + b)

fun helloWorld() = println("Hello World!")

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