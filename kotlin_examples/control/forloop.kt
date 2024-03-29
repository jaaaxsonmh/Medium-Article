package kotlin_examples.control




fun main(args: Array<String>) {
    val list = listOf("Apple", "Banana", "Carrot")

    for (e in list) {
        println(e)
    }

    val elonCompanies: Array<Any> = arrayOf("Tesla", "Space X", "Solar City", "Open AI", "Boring Company", "PayPal")

    for (item in elonCompanies.indices) {
        println("${elonCompanies[item]} at index $item")
    }

    for (i in elonCompanies.indices) {
        if (i % 2 == 0)
            println(elonCompanies[i])
    }

    val name = "Elon Musk"

    for (index in name.indices) {
        if (name[index] == ' ') {
            println("Character ${name[index]} found at index $index")
        } else {
            println("Character ${name[index].toUpperCase()} found at index $index ")
        }
    }

    for(index in name.indices) {
        val currentChar = name[index].toUpperCase()
        println("Current: $currentChar, Character after: ${currentChar.inc()}, Character before: ${currentChar.dec()} ")
    }
}