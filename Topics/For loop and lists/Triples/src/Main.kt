fun main() {
    // write your code here
    val cnt =readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until cnt) {
        mutList.add(readln().toInt())
    }
    var final=0
    for (i in 0 until mutList.size-2) {

        if (mutList[i+1]-mutList[i]==1 && mutList[i+2]-mutList[i+1]==1)
          final++

    }
    println(final)
}