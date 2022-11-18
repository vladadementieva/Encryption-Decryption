fun main() {
    // write your code here
    val count = readln().toInt()
    var sum = 0
    for (i in 1..count) {
        val di = readln().toInt()
        sum += di
    }
    print(sum)
}