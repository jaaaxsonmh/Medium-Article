package kotlin_examples.simple_recursion

fun factorial(n: Int): Long {
    return if(n == 1) n.toLong() else n * factorial(n - 1 )
}
fun main(args: Array<String>){
    val number = 5
    val result: Long

    result = factorial(number)
    println("The factorial of $number is: $result")


}