package kotlin_examples.control


fun bigger(a: Int, b: Int) = if (a > b) a else b
fun smaller(a: Int, b: Int) = if (a > b) b else a

fun main(args: Array<String>) {

    val number = (1..10).shuffled().first()

    if (number < 5) {
        println("$number is less than 5")
    } else {
        println("$number is greater than 5")
    }

    // Used as expression as returns value
    val result = if (number > 5) {
        "$number is greater than 5"
    } else {
        "$number is less than 5"
    }

    println("Result is that: $result")

    // No tenary operator in Kotlin back can do this... and remove the curly braces since single statement
    val resultTernary = if (number > 5) "Bigger than 5" else "Smaller than 5"
    println("Result is that: $resultTernary")

    println("Which is bigger? 10 or 5:  " + bigger(10, 5))
    println("Which is smaller? 10 or 5:  " + smaller(10, 5))
}