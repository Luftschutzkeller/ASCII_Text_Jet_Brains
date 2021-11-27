package signature

import java.lang.Math.max

fun main() {
    val alf = arrayOf(
        arrayOf("____", "|__|", "|  |"),
        arrayOf("___ ", "|__]", "|__]"),
        arrayOf("____", "|   ", "|___"),
        arrayOf("___ ", "|  \\", "|__/"),
        arrayOf("____", "|___", "|___"),
        arrayOf("____", "|___", "|   "),
        arrayOf("____", "| __", "|__]"),
        arrayOf("_  _", "|__|", "|  |"),
        arrayOf("_", "|", "|"),
        arrayOf(" _", " |", "_|"),
        arrayOf("_  _", "|_/ ", "| \\_"),
        arrayOf("_   ", "|   ", "|___"),
        arrayOf("_  _", "|\\/|", "|  |"),
        arrayOf("_  _", "|\\ |", "| \\|"),
        arrayOf("____", "|  |", "|__|"),
        arrayOf("___ ", "|__]", "|   "),
        arrayOf("____", "|  |", "|_\\|"),
        arrayOf("____", "|__/", "|  \\"),
        arrayOf("____", "[__ ", "___]"),
        arrayOf("___", " | ", " | "),
        arrayOf("_  _", "|  |", "|__|"),
        arrayOf("_  _", "|  |", " \\/ "),
        arrayOf("_ _ _", "| | |", "|_|_|"),
        arrayOf("_  _", " \\/ ", "_/\\_"),
        arrayOf("_   _", " \\_/ ", "  |  "),
        arrayOf("___ ", "  / ", " /__")
    )
    print("Enter name and surname: ")
    val name = readLine()!!.lowercase()
    print("Enter person's status: ")
    val status = readLine()!!
    var nameLen = -1
    name.forEach { nameLen += if (it == ' ') 5 else alf[it - 'a'][0].length + 1 }
    val maxLen = max(nameLen, status.length)
    println("*".repeat(maxLen + 6))
    for (i in 0..2) {
        print("*  " + " ".repeat((maxLen - nameLen) / 2))
        name.forEach { print((if (it == ' ') "    " else alf[it - 'a'][i]) + " ") }
        print(" ".repeat((maxLen - nameLen + 1) / 2) + " *\n")
    }
    println("*  " + " ".repeat((maxLen - status.length) / 2) + status + " ".repeat((maxLen - status.length + 1) / 2) + "  *")
    println("*".repeat(maxLen + 6))
}



