abstract class Plane(val name: String) : Flyable {
    abstract fun Info()
    abstract fun Lifting(persCount: Int, baggWeight: Int)
}