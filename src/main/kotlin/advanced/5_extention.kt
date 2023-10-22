package advanced

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) {
        println("널인 경우에만 출력")
    } else {
        println("널이 아닌 경우에만 출력")
    }
}

fun main() {
    println("abcd".first())
    println("abcd".addFirst('z'))

    MyExample().printMessage("안녕")

    var myExample: MyExample? = null
    myExample.printNullOrNotNull() // 내부에서 null 을 처리하고 있기 때문에 ? 없이 사용가능함

    myExample = MyExample()
    myExample.printNullOrNotNull()
}
