fun main() {

    //PERSONA 1
    val persona1 = Persona(65.80, 1.75)
    println("Introduce un nombre para Persona1: ")
    var nombre = readln()
    while (nombre.isBlank()) {
        nombre = readln()
    }
    persona1.nombre = nombre

    //PERSONA 2
    //val persona2 = Persona()

    //PERSONA 3
    val persona3 = Persona(75.0, 1.80)
    val persona3Nombre = "Juan"
    val p3Imc = persona3.imc(persona3.peso, persona3.altura)


    //IMPRIMIMOS LOS DATOS DE PERSONA-1
    println(
        "Persona-1\n" +
                "Nombre: ${persona1.nombre}\n" +
                "Peso: ${persona1.peso}\n" +
                "Altura: ${persona1.altura}"
    )


    //IMPRIMIMOS LOS DATOS DE PERSONA-3
    println(
        "Persona-3\n" +
                "Nombre: ${persona3Nombre}\n" +
                "Peso: ${persona3.peso}\n" +
                "Altura: ${persona3.altura}\n" +
                "IMC: $p3Imc"
    )
}