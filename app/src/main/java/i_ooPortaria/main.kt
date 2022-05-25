package i_ooPortaria

fun main(){

    portaria()

}

fun portaria(){

    print("Qual a sua idade? ")
    val idade = readLine()

    if(idade!= null && idade !=""){
        if(idade.toInt()<18){
            println("Negado. Menores de idade não são permitidos")
            return
        }else{
            println("Bora")
        }
    }

}