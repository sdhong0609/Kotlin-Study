package chap02.test

fun main() {
    val a: Int = 65
    val b: Double = a.toDouble()
    val c: Byte = a.toByte()
    val d: Long = a.toLong()
    val e: Char = a.toChar()
    val f: Float = a.toFloat()
    println(e)
    val result = 1L + 3 // Long형 + Int형 -> result는 Long형
    println(result)
}