fun main() {
    // write your code here
    val first=readln().toInt()
    val second=readln().toInt()
    val third=readln().toInt()
    val fourth=readln().toInt()
    val value=readln().toInt()
    println(value in first..second && value in third..fourth)

}