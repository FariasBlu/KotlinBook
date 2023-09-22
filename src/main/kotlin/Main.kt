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

        // boolean

        val x = 1
        val y = 2
        val z = 2

        val isTrue = x < y && x < z
        p(isTrue)

        val alsoTrue = x == y || y == z
        p(alsoTrue)

        // chars

}