import kotlinx.coroutines.*

fun main() = runBlocking {
    print("Введите название самолёта - ")
    val name = readln()!!.toString()
    val militaryPlane = Millitary(name)

    print("Введите количество пассажиров: ")
    val count = readln()!!.toInt()
    print("Введите общий вес багажа: ")
    val bagg = readln()!!.toInt()
    militaryPlane.Lifting(count, bagg)

    militaryPlane.Info()

    militaryPlane.TakeOff()

    print("Введите количество запусков проверки сопротивления: ")
    val n = readln()!!.toInt()

    GlobalScope.launch {
        for (i in 1..n){
            println("${i} проверка")
            militaryPlane.Resist()
        }
    }
    delay((1000))
}