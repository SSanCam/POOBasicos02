class Persona(peso: Double, altura: Double) {

    //GETTERS Y SETTERS - PROPIEDADES DE CLASE:
    val peso: Double = peso
        get() = field

    val altura: Double = altura
        get() = field

    val imc: Double = peso / (altura * altura)
        get() = field

    var nombre: String = ""
        get() = field
        set(value) {
            require(value.isNotBlank()) { "Debes introducir un nombre válido." }
            field = value
        }
    fun imc(peso: Double, altura: Double): Double{
        val imc = peso / (altura * altura)
        return imc
    }
    //CONSTRUCTOR SECUNDARIO
    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return super.toString()
    }
}

