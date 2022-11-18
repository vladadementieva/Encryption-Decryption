import java.io.File

fun main() {
    val lines = File("/home/vlada/Загрузки/words_with_numbers.txt").readBytes()
    var counter=0
    /*for (line in lines) {
     if(line.toChar().isDigit())
         counter++
    }*/
    File("/home/vlada/Загрузки/words_with_numbers.txt").forEachLine {it -> if(it.toIntOrNull()!=null) counter++}
    println(counter)
}