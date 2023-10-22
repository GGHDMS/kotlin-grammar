package advanced

fun main() {
    val client: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
//        connect()
    } /*.connect().run { println(this) }*/

    println(client)

    client.connect().run { println(this) }
}
