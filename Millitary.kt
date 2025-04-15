import kotlin.random.Random

class Millitary(name: String) : Plane(name) {
    open val pointD: String = ""
    open val pointApp: String = ""
    open val date: String = ""
    open val timeD: Int = 0
    open val travelTime: Int = 0

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
}