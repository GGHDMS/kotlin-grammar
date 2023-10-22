package advanced

import advanced.MyClass.MyCompanion.a

fun main() {
    /*
        val list = mutableListOf(printHello)

        val func: () -> Unit = list[0]
        func()
    */

//    call(printHello)

    /* 불가능
        val func = printNo
        val list = mutableListOf(printNo)
        call(printNo)
    */

    /*
        val result = plus(1, 3)
        println(result)
    */

    /*
        val list = listOf("a", "b", "c")
        val printStr: (String) -> Unit = { println(it) }

        forEachStr(list, printStr)

        val uppercase: (String) -> String = { it.uppercase() }
        list.map {
            it.uppercase()
        }
    */
//    outerFunc()()

    arg1 {
        it.length
    }

    arg2 { a: String, b: String ->
        a.length
        b.first()
    }

//    val callReference: () -> Unit = { printHello() }
    val callReference = ::printHello
    callReference()()

    val numberList = listOf("1", "2", "3")
    numberList.map { it.toInt() }.forEach(::println)

    numberList.map(String::toInt).forEach(::println)
}

fun arg1(block: (String) -> Unit) {}

fun arg2(block: (String, String) -> Unit) {}

// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// 최대한 생략한 람다 식
val sum2 = { x: Int, y: Int -> x + y }

fun outerFunc(): () -> Unit = { println("이것은 익명함수!") } /*{
    *//*
        return fun() {
            println("이것은 익명함수!")
        }
    *//*
//    return { println("이것은 익명함수!") }
}*/

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val printMessage: (String) -> Unit = { message: String -> println(message) }

val printMessage2: (String) -> Unit = { message -> println(message.length) }

val printMessage3: (String) -> Unit = { println(it.length) }

val plus: (Int, Int) -> Int = { a, b -> a + b }

val printHello: () -> Unit = { println("Hello") }
// val func: () -> Unit = {}

fun call(block: () -> Unit) {
    block()
}

fun printNo() {
    println("No!")
}
