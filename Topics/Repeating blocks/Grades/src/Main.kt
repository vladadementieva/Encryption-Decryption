fun main() {
    // put your code here
    val cnt=readln().toInt()
    var cntA=0
    var cntB=0
    var cntC=0
    var cntD=0
    repeat(cnt)
    {
        val value=readln().toInt()
        if (value==2) {cntD++}
        if (value==3) {cntC++}
        if (value==4) {cntB++}
        if (value==5) {cntA++}

    }
    print("$cntD $cntC $cntB $cntA")
}