fun main() {
    // put your code here
    val str=readln()
    var j=0
    for (i in 0 until str.length) {
        when (str[i].isDigit()) {
             true->j++
        }
    }
    print(j)
}