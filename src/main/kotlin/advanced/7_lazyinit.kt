package advanced

class HelloBot {
    val greeting: String by lazy/*(LazyThreadSafetyMode.NONE)*/ {
        println("안녕하세요 초기화")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    // ..
    // ..

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}
