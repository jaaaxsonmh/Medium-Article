package kotlin_examples.simple_recursion

fun factorial(n: Int): Double {
    return if(n == 1) n.toDouble() else n * factorial(n - 1 )
}
fun main(args: Array<String>){
    val number = 30
    val result: Double

    result = factorial(number)
    println("The factorial of $number is: $result")


}