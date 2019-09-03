package kotlin_examples.control

fun bigger(a: Int, b: Int) = if (a > b) a else b

fun smaller(a: Int, b: Int) = if (a > b) b else a


fun main(args: Array<String>){
    println("Which is bigger? 10 or 5:  " + bigger(10, 5))
    println("Which is smaller? 10 or 5:  " + smaller(10, 5))


}