package encryptdecrypt

import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    var mode = "enc"
    var key = 0
    var data = ""
    var inFile = ""
    var outFile = ""
    var alg = "shift"
    for (i in 0 until args.size - 1) {
        when (args[i]) {
            "-mode" -> mode = args[i + 1]
            "-key" -> key = args[i + 1].toInt()
            "-data" -> data = args[i + 1]
            "-in" -> inFile = args[i + 1]
            "-out" -> outFile = args[i + 1]
            "-alg" -> alg = args[i + 1]
        }
    }
    if (inFile.isNotEmpty() and data.isEmpty()) {
        try {
            data = File(inFile).readText()
        } catch (e: FileNotFoundException) {
            println("Error")
        }

    }
    if (mode == "enc") {
        enc(key, data, outFile, alg)
    }
    if (mode == "dec") {
        dec(key, data, outFile, alg)
    }
}

fun dec(key: Int, data: String, outFile: String, alg: String) {
    var result = ""
    if (alg.contentEquals("shift")) {
        result = shiftDec(data, key)
    } else {
        for (element in data) {
            result += (element.code - key).toChar()

        }
    }
    outputResult(outFile, result)
}

private fun enc(key: Int, data: String, outFile: String, alg: String) {
    var result = ""
    if (alg.contentEquals("shift")) {
        result = shiftEnc(data, key)
    } else {
        for (element in data) {
            result += (element.code + key).toChar()

        }
    }
    outputResult(outFile, result)
}

private fun outputResult(outFile: String, result: String) {
    if (outFile.isEmpty()) {
        print(result)
    } else {
        File(outFile).writeText(result)
    }
}

private fun shiftEnc(ini: String, i: Int): String {
    var result = ""
    for (j in ini.indices) {
        result += if (ini[j].isLetter()) {
            val ch = 123 - ini[j].code
            if (ch > i) {
                (i + ini[j].code).toChar()
            } else {
                (i - ch + 97).toChar()
            }
        } else {
            ini[j]
        }
    }
    return result
}

private fun shiftDec(ini: String, i: Int): String {
    var result = ""
    for (j in ini.indices) {
        result += if (ini[j].isLetter()) {
            val ch =  ini[j].code - i
            if (ch < 97) {
                (123-(97-ch)).toChar()
            } else {
               ch.toChar()
            }
        } else {
            ini[j]
        }
    }
    return result
}