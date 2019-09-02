package kotlin_examples.basics

fun main(args: Array<String>){
    val name = "Jack" //can't be reassigned as it is immutable
    var age = 22    // can be reassigned as it is mutable

    for(i in 0..10){
        println("My name is $name and I am $age years old")
        age++
    }
}