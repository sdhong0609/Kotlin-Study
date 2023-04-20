package chap02.section2

fun main() {
    // 정수 자료형
    println("Byte min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE) // 1바이트(8비트)
    println("Short min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE) // 2바이트(16비트)
    println("Int min: " + Int.MIN_VALUE + " max: " + Int.MAX_VALUE) // 4바이트(32비트)
    println("Long min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE) // 8바이트(64비트)

    // 실수 자료형
    println("Float min: " + Float.MIN_VALUE + " max: " + Float.MAX_VALUE) // 4바이트(32비트)
    println("Double min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE) // 8바이트(64비트)
}