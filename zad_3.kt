fun main(){
    try {
        val a = 15
        val b = 30
        println("Введите x сторону кирпича:")
        var x = readln().toDouble()
        println("Введите y сторону кирпича:")
        var y = readln().toDouble()
        println("Введите z сторону кирпича:")
        var z = readln().toDouble()
        when {
            x<=15 || y <= 30 -> println("Кирпич вошел!")
            else -> println("Кирпич великоват!")
        }
    }
    catch (y:Exception){
        println("Неверный ввод!")
    }
}