package b_estruturaDados


fun main() {
    branco()
}


//Strings como array
//frist ; last ; String.lenght ; String[index]


fun olaMundo() {

    val nome = "Johnny"
    val sobrenome = "Eder"


    println(nome)
    println(nome[0])
    println(nome.first())
    println(nome.last())
    println(nome.length)
    println(nome[nome.length - 1])

    println(nome + sobrenome)
    println(nome.plus(sobrenome))


}


fun branco() {

    val nome = ""
    val nome2: String? = null

    println(nome.isBlank())
    println(nome.isEmpty())
    println(nome2.isNullOrBlank())
    println(nome2.isNullOrEmpty())

    //Se o tamanho da string (s.lenght) for 0 está empty e black
    //Se o tamanho da string for >0 mas todos os caracteres são espaços em branco,
    // está black mas não empty
}




