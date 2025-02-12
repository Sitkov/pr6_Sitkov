fun main(){
    try {
        var a = readln().toInt()
        when {
            a/100 == a%10 -> println("1 и 3 числа равны!")
            else -> println("1 и 3 числа не равны!")
        }
    }
    catch (a:Exception){
        println("Неверный ввод!")
    }
}