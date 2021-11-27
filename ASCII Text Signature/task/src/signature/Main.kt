package signature

fun main() {
    val name = readLine()!!
    printThing(name)
}

fun printThing(name: String) {
    val length = name.length + 4
    val bord = "*".repeat(length)

    println(bord)
    println("* $name *")
    println(bord)
}
