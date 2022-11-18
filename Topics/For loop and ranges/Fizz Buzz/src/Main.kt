fun main() {
    // put your code here
    val first = readln().toInt()
    val second = readln().toInt()
    for (elem in first..second) {
        if (elem % 3 == 0 && elem % 5 == 0) {
            println("FizzBuzz")
        } else if (elem % 3 == 0) println("Fizz")
        else if (elem % 5 == 0) println("Buzz")
        else println(elem)
    }
}