fun main() {
    // write your code here
    val size= readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    var res=0
    for (i in 0 until mutList.size-1) {
            if ((mutList[i] == numbers[0] && mutList[i + 1] == numbers[1])
                || (mutList[i+1] == numbers[0] && mutList[i] == numbers[1])) {
                res += 1
            }
        }

    if (res>0) print("NO") else println("YES")
}