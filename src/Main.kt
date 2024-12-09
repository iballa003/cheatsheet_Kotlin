//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Constantes
    val ENTERO_CONSTANTE : Int = 5

    // Tipos básicos variables
    var entero : Int = 7 // Int
    var string : String = "Hola" // String
    var float : Float = 5.0f // Float
    var long : Long = 1000L // Long

    println("Número entero: ${entero}")
    println("Cadena: ${string}")
    println("Número flotante: ${float}")
    println("Número grande: ${long}")

    // Colecciones
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

// Lista mutable con declaración de tipo explícita
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    shapes.add(3,"2")
    println(shapes)
    val shapes2d : MutableList<MutableList<String>> = mutableListOf(mutableListOf("triangle", "square", "circle"),mutableListOf("triangle2", "square2", "circle2"))
    shapes2d.add(2,mutableListOf("triangle3", "square3", "circle3"))
    shapes2d[0].add("rombo")
    println(shapes2d)

    val shapes2d2 : MutableList<List<String>> = mutableListOf(listOf("triangle", "square", "circle"))
    shapes2d2.add(listOf("triangle2", "square2", "circle2"))

    println(shapes2d2)

    // Condiciones

    var cadena: String = "abc"

    if (cadena == "abc") {
        println("Correcto")
    }else{
        println("Incorrecto")
    }

    // When
    val x = 2
    when (x) {
        1 -> print("x es igual a 1")
        2 -> print("x es igual a 2")
        else -> print("x no es ni 1 ni 2")
    }

    //NullSafety
    var s: String? = "prueba"
    println(s)
    if (s != null) {
        println("Logintud de la cadena ${s.length}")
    } else {
        println("Cadena nula")
    }
    // Aquí le asignamos null
    s = null
    println(s)
    if (s != null) {
        println("Logintud de la cadena ${s.length}")
    } else {
        println("Cadena nula")
    }

    // Dataclass
    data class Person(val name: String) {
        var age: Int = 0
    }
    val person1 = Person("Iballa")
    val person2 = Person("Iballa")
    person1.age = 20
    person2.age = 23

    println("person1 == person2?: ${person1 == person2}")

    // For loop
    println("For loop")
    for (numero in shapes) {
        println(numero)
    }

    // While loop
    println("While loop")
    var numero = 0
    while (numero < shapes.count()) {
        println(shapes[numero])
        numero++
    }
}