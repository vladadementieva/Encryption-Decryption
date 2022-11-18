fun main() {
    // write your code here
    val str1 = readln()
    val oper = readln()
    val str2 = readln()
    when (oper) {
        "equals" -> println(str1 == str2)
        "plus" -> println(str1 + str2)
        "endsWith" -> println(str1.endsWith(str2))
        else ->
            println("Unknown operation")
    }
}