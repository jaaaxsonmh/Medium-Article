package kotlin_examples.control

fun rangeCheck(x: Number) = when (x) {
    0 -> "Zero"
    in 1..4 -> "between one and four"
    else -> "Something else"
}

fun mathOperations(operator: String?, a: Int?, b: Int?) {
    when (operator) {
        "+" -> println("$a + $b  = ${a?.plus(b!!)}")
        "-" -> println("$a - $b  = ${a?.minus(b!!)}")
        "/" -> println("$a / $b  = ${a?.div(b!!)}")
        "*" -> println("$a * $b  = ${a?.times(b!!)}")
        else -> println("Not a valid operator")
    }
}

fun main(args: Array<String>) {
    println(rangeCheck(8))

    val operator: String? = readLine()
    val a: String? = readLine()
    val b: String? = readLine()

    mathOperations(operator, a?.toInt(), b?.toInt())

}