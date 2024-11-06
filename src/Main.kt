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

    // Collections
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

// Mutable list with explicit type declaration
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
}