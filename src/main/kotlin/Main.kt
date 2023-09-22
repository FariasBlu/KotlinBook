fun main() {
        // single-line functions
        fun plusOne(x: Int) = x + 1

        // explicits annotations
        val explicitType: Number = 12.3

        // creation literal numbers

        val int = 123
        val long = 23456L
        val double = 12.34
        val float = 23.34F
        val hexadecimal = 0xAB
        val binary = 0b01010101

        // converting numbers

        val entire = 123
        val longEntire = entire.toLong()

        val numberFloat = 12.34F
        val numberDoubleFloat = entire.toFloat()

        // operators bitwise (bit a bit)
        val leftShift = 1 shl 2
        val rightShift = 1 shr 2
        val unsignedShift = 1 ushr 2

        val and = 1 and 0x00001111
        val or = 1 or 0x00001111
        val xor = 1 xor 0x00001111
        val inv = 1.inv()
}