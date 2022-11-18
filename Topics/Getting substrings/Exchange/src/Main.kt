fun main() {
    // put your code here
    val ini = readln()
    val fi = ini.first()
    val la = ini.last()
    var final = la + ini.substring(1, ini.length - 1) + fi
    println(final)
}