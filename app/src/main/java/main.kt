import logica.*

fun main(){

    var exercicio: Int = 5


    //Logica para chamar os exercícios
    when(exercicio){
        1 -> Ex01 (5)                            //Tabuada
        2 -> Ex02 (2,5)                         //Area do Terreno
        3 -> println(Ex03(5))                    //Par ou impar?
        4 -> println(Ex04(10,5))                // Divisao de dois numeros
        5 -> Ex05(10,11)                    //Padaria
        6 -> Ex06()
        7 -> Ex07()
        8 -> Ex08()
        9 -> Ex09()
        10 -> Ex10()
    }


}