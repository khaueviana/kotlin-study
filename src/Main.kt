const val bacalhau = 1 // top level

fun main(){
    println("Hello, world!")

    val customers = variables()

    stringTemplates(customers)

    mathOperations()

    initializingVariables()
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