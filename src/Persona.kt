class Persona(peso: Double, altura: Double) {

    //GETTERS Y SETTERS - PROPIEDADES DE CLASE:
    val peso: Double = peso

    val altura: Double = altura

    val imc = String.format("%.2f", peso / (altura * altura))

    var nombre: String = ""
        get() = field
        set(value) {
            require(value.isNotBlank()) { "Debes introducir un nombre válido." }
            field = value
        }
    //METODOS:
    fun imc(peso: Double, altura: Double): Double{
        val imc = peso / (altura * altura)
        return imc
    }
    //CONSTRUCTOR SECUNDARIO
    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return ("Persona: (nombre: $nombre, peso = $peso kg, altura = $altura m, imc = $imc)")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Persona

        if (peso != other.peso) return false
        if (altura != other.altura) return false
        if (imc != other.imc) return false
        if (nombre != other.nombre) return false

        return true
    }

    override fun hashCode(): Int {
        var result = peso.hashCode()
        result = 31 * result + altura.hashCode()
        result = 31 * result + imc.hashCode()
        result = 31 * result + nombre.hashCode()
        return result
    }
}

