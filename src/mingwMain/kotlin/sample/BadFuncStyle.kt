package sample
fun main() {
    val table: Iterable<Pair<Int, Boolean>> =
        listOf(1 to true, 2 to true, 3 to false, 4 to true, 5 to true)

    println("Bad: table.map iterates over whole table")

    var anyFalse = table
        .map {
            println(it)
            it.second
        }
        .all { it }

    print(anyFalse)



    println("\nGood: table.asSequence().map iterates until first (_, false) pair")

    anyFalse = table.asSequence()
        .map {
            println(it)
            it.second
        }
        .all { it }

    print(anyFalse)



    println("\nBut it good too")

    anyFalse = !table.any{ it.second }

    print(anyFalse)



}