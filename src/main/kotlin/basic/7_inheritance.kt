package basic

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class BullDog(override var age: Int = 0) : Dog() {

    // override 시 자동 open
    final override fun bark() {
        super.bark()
//        println("컹컹")
    }
}

class ChildBulldog : BullDog() {
    override var age: Int = 0

    /*
        override fun bark() {
            println("캉캉")
        }
    */
}

abstract class Developer() {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    var backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

    /*
        var dog = BullDog(age = 2)
        println(dog.age)
        dog.bark()
    */
}
