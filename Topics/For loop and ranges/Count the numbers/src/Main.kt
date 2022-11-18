fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var i = 0
    for (x in a..b) {
        if (x%n==0)
        {
            i++
        }
    }
    print(i)
}