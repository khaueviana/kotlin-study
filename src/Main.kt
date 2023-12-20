const val bacalhau = 1 // top level

fun main(){
    println("Hello, world!")

    val customers = variables()

    stringTemplates(customers)

    mathOperations()

    initializingVariables()

    collectionList()

    collectionSet()
}

private fun stringTemplates(customers: Int) {
    println()
    println("## String Templates")

    println("There are $customers customers")

    println("There are ${customers + 1} customers")
}

private fun variables(): Int {
    println()
    println("## Variables")

    val popcorn = 5 // read only
    val bifanas = 7 // mutable
    var customers = 10

    customers = 8
    println(popcorn)
    println(bifanas)
    println(customers)
    println(bacalhau)

    return customers
}

private fun mathOperations(){
    println()
    println("## Math Operations")
    var life = 10;

    life = 8;

    life = life + 3
    life += 7
    life -= 3
    life *= 2
    life /= 3

    println(life)
}

private fun initializingVariables(){
    println()
    println("## Initializing Variables")
    val d: Int

    d = 3

    val e: String = "hello"

    println(d)
    println(e)
}

private fun collectionList(){
    println("## Collection List")
    // Lists store items in the order that they are added, and allow for duplicate items.

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // lists are ordered and there are many interesting methods
    println("item ${readOnlyShapes[0]}")
    println("item ${readOnlyShapes.first()}")
    println("item ${readOnlyShapes.last()}")
    println("item ${readOnlyShapes.count()}")

    // check item is in a list
    println("circle" in readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // casting from mutable to immutable list
    val shapes2 : MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapes2Locked : List<String> = shapes2

    // adding and removing items
    shapes2.add("life is good")
    shapes2.remove("circle")
}

private fun collectionSet(){
    println()
    println("## Collection Set")
    // Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit : MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
}

private fun collectionMap(){
     /* Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a
     map like a food menu. You can find the price (value), by finding the food (key) you want to eat.
     Maps are useful if you want to look up a value without using a numbered index, like in a list. */

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu : MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    // Operations
    juiceMenu.put("coconut", 150)
    juiceMenu.remove("orange")
    println(readOnlyJuiceMenu.containsKey("kiwi"))
}