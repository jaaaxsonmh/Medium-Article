package kotlin_examples.simple_recursion

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}

tailrec fun fibonacci(n: Int, a: Long, b: Long): Long {
    return if (n == 0) b else fibonacci(n - 1, a + b, a)
}

fun main(args: Array<String>) {
    val number = 9
    var result: Long

    result = factorial(number)
    println("The factorial of $number is: $result")

    result = fibonacci(number, 0, 1)
    println("The $number number of fibonacci is: $result")
}