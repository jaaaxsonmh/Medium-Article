package kotlin_examples.control

fun rangeCheck(x: Number) = when (x) {
    0 -> "Zero"
    in 1..4 -> "between one and four"
    6, 9, 100 ->"6 nine or 100"
    else -> "Something else"
}

fun mathOperations(operator: String?, a: Int?, b: Int?) {
    when (operator) {
        "+" -> "$a + $b  = ${a?.plus(b!!)}"
        "-" -> "$a - $b  = ${a?.minus(b!!)}"
        "/" -> "$a / $b  = ${a?.div(b!!)}"
        "*" -> "$a * $b  = ${a?.times(b!!)}"
        else -> println("Not a valid operator")
    }
}

fun typeCheck(type: Any) {
    when(type) {
        is Int -> println("Is int")
        is String -> println("Is String")
        is Boolean -> println("Is boolean")
    }
}

fun main(args: Array<String>) {
    println(rangeCheck(8))

    println("Pick a math operator i.e. / + - *")
    val operator: String? = readLine()
    println("Pick two numbers to be calculated")
    val a: String? = readLine()
    val b: String? = readLine()

    println(mathOperations(operator, a?.toInt(), b?.toInt()))

    typeCheck("Hello")
    typeCheck(1)
    typeCheck(false)
}