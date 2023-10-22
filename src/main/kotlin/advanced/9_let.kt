package advanced

import advanced.MyClass.MyCompanion.a

fun main() {
    val str: String? = "안녕"

    // null 이 아닌 경우
    val result: Int? = str?.let {
        println(it)
        1234
    }

    /*
            val abc: String? = "abc"
            abc?.let {
                val def: String? = "def"
                def?.let {
                    println("abcdef가 null 아님")
                }
            }
    */
    val abc: String? = "abc"
    val def: String? = "def"

    if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
        println("abcdef 가 null 아님")
    }
    println(result)

    /*
        val this: String? = null
        val it: String? = null
    */

    val hello = "hello"
    val hi = "hi"

    hello.let { a: String ->
        println(a.length)
        hi.let { b: String ->
            println(a.length)
            println(b.length)
        }
    }
}
