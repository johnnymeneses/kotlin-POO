import logica.Ex01
import logica.Ex02
import logica.Ex03


fun main(){

    var exercicio: Int = 3


    //Logica para chamar os exercícios
    when(exercicio){
        1 -> Ex01 (5)                           //Tabuada
        2 -> Ex02 (2,5)                        //Area do Terreno
        3 -> println(Ex03(5))                   //Par ou impar?
    }






}