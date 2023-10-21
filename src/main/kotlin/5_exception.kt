fun main() {
    Thread.sleep(1)

    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }

    println(a)

//    throw Exception("예외 발생!")

    val b: String? = "널이 아님"
    val c: String = b ?: failFast("a is null")

    println(c.length)

    failFast("예외 발생!")

    println("이 메시지는 출력될까?")
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}
