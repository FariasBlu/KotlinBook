@file:Suppress("UNREACHABLE_CODE")

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths



data class Variavel<T>(val nome: String, val valor: T)

fun main() {

    fun <T> p(value: T) {
        println(value.toString())
    }

    // single-line functions
    fun plusOne(x: Int) = x + 1

    // explicits annotations
    val explicitType: Number = 12.3
    p(explicitType)

    // creation literal numbers

    val int = 123
    p(int)

    val long = 23456L
    p(long)

    val double = 12.34
    p(double)

    val float = 23.34F
    p(float)

    val hexadecimal = 0xAB
    p(hexadecimal)

    val binary = 0b01010101
    p(binary)

    // converting numbers

    val entire = 123
    p(entire)

    val longEntire = entire.toLong()
    p(longEntire)

    val numberFloat = 12.34F
    p(numberFloat)

    val numberDoubleFloat = entire.toFloat()
    p(numberFloat)

    // operators bitwise (bit a bit)
    val leftShift = 1 shl 2
    p(leftShift)

    val rightShift = 1 shr 2
    p(rightShift)

    val unsignedShift = 1 ushr 2
    p(unsignedShift)

    val and = 1 and 0x00001111
    p(and)

    val or = 1 or 0x00001111
    p(or)

    val xor = 1 xor 0x00001111
    p(xor)

    val inv = 1.inv()
    p(inv)

    // BOOLEAN

    val x = 1
    val y = 2
    val z = 2

    val isTrue = x < y && x < z
    p(isTrue)

    val alsoTrue = x == y || y == z
    p(alsoTrue)

    // CHARS

    val string = "string with \n new line"
    p(string)

    val rawString = """
        raw string is super useful for strings that span many lines """

    p(rawString)

    //ARRAY

    val array = arrayOf(1, 2, 3)
    p(array[0])

    val perfectSquares = Array(10) { k -> k * k }
    p(perfectSquares)

    val element1 = array[0]
    val element2 = array[1]
    array[2] = 5

    p(element1)
    p(element2)
    p(array[2])

    // TEMPLATE STRINGS OR INTERPOLATION STRINGS

    val name = "John Doe"
    val concat = "Hello " + name
    val concatInterpolation = "Interpolation: $concat. O nome tem ${name.length} caracteres"

    p(concat)
    p(concatInterpolation)

    //RANGE

    val aToZ = "a".."z"
    val isTrueInterval = "c" in aToZ

    p(isTrueInterval)

    val oneToNine = 1..9
    val isFalseInterval = 11 in oneToNine

    p(isFalseInterval)

    val countingDown = 100.downTo(0)
    p(countingDown)
    val rangeTo = 10.rangeTo(20)
    p(rangeTo)

    val oneToFifty = 1..50
    val addNumbers = oneToFifty.step(2)

    p(oneToFifty)
    p(addNumbers)

    val countingDownEvenNumbers = (2..100).step(2).reversed()
    p(countingDownEvenNumbers)

    //LOOPS

//        while (true){
//                println("This will print out for a long time!")
//        }

    val list = listOf(1, 2, 3, 4)

    for (k in list) {
        println(k)
    }

    val set = setOf(1, 2, 3, 4, 6, 7)

    for (k in set) {
        println(k)
    }

    val oneToTen = 1..10
    for (k in oneToTen) {
        for (j in 1..5) {
            println(k * j)
        }
    }

    val string1 = "print my characteres"
    for (char in string1) {
        println(char)
    }

    for (index in array.indices) {
        println("Element $index is ${array[index]}")
    }

    fun readFile(path: Path): Unit {
        val input = Files.newInputStream(path)
        try {
            var byte = input.read()
            while (byte != -1) {
                println(byte)
                byte = input.read()
            }
        } catch (e: IOException) {
            println("Error reading from file. Error was ${e.message}")
        } finally {
            input.close()
        }
    }

    val filePath = Paths.get("/Users/celso.fariasuseblu.com.br/Documents/exemplo.txt")
    readFile(filePath)
}