fun main() {
    // put your code here
    val cnt= readln().toInt()
    var i=0
    repeat(cnt)
    {
        val value= readln().toInt()
        if (value>0) {i++}
    }
    print(i)
}