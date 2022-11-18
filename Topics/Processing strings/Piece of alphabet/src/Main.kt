fun main() {
    // write your code here
    val iniString = readln()
    var result=0
    for (i in 0 until iniString.length-1) {
     if (iniString[i+1]-iniString[i]!=1)
     {
        result++
     }
    }
    print(result==0)
}