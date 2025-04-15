import kotlin.random.Random
import kotlinx.coroutines.*

class Millitary(name: String) : Plane(name) {
    open val pointD: String = "пункт А"
    open val pointApp: String = "пункт Б"
    open val date: String = "12.10.2020"
    open val timeD: Int = 14
    open val travelTime: Int = 3

    override fun Info(){
        println("Самолёт ${name}\n" +
                "Отправляется из ${pointD} в ${pointApp}\n" +
                "Дата и время отправления: ${date} ${timeD}\n" +
                "Время в пути: ${travelTime}")
    }

    override fun Lifting(persCount: Int, baggWeight: Int){
        var rnd = Random.nextInt(68,90)
        var totalWeightPers = persCount * rnd
        var totalWeight = totalWeightPers + baggWeight
        println("Полезная нагрузка: ${totalWeight}")
    }

    override fun TakeOff() {
        println("Подготовка к взлёту...")
        runBlocking { delay(2000) }
        println("Самолёт ${name} взлетел")
    }

    override fun Resist() {
        val rnd = Random.nextInt(0, 100)
        println("сопротивление - ${rnd}%")
    }
}