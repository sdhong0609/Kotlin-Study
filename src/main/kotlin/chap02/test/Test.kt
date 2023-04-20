package chap02.test

fun main() {
    val num05 = 127 // Int형으로 추론
    val num06 = -32768 // Int형으로 추론
    val num07 = 2147483647 // Int형으로 추론
    val num08 = 9223372036854775807 // Long형으로 추론

//    val exp01 = 123 // Int형으로 추론
//    val exp02 = 123L // 접미사 L을 사용해 Long형으로 추론
//    val exp03 = 0x0F // 접두사 0x를 사용해 16진 표기가 사용된 Int형으로 추론
//    val exp04 = 0b00001011 // 접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론

    val exp08: Byte = 127 // 명시적으로 자료형을 지정(Byte형)
    val exp09 = 32767 // 명시적으로 자료형을 지정하지 않으면 Short형 범위의 값도 Int형으로 추론
    val exp10: Short = 32767 // 명시적으로 자료형을 지정(Short형)

    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    val number = 1_000_000
    val cardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val exp01 = 3.14 // Double형으로 추론(기본)
    val exp02 = 3.14F // 식별자 F에 의해 Float형으로 추론
    val exp03 = 3.14E-2
    val exp04 = 3.14e2

    val ch = 'A'
    println(ch + 1)
//    val chNum: Char = 65 // 오류! 숫자를 사용하여 선언하는 것은 금지, 문자 값으로 선언해야 함

    val code: Int = 65
    val chFromCode: Char = code.toChar() // code에 해당하는 문자를 할당
    println(chFromCode) // 결과는 A
    val ch3 = '\uD55C'
    println(ch3)
}