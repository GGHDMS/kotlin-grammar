package advanced

class LateInit {
    lateinit var text: String

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }
        println(text)
    }
}

fun main() {
    val test = LateInit()
    test.text = "하이요"
//    test.text.isInitialized() 사용불가
    println(test.textInitialized)
    test.printText()
}
