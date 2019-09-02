package kotlin_examples.basics

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    println("5 + 6 = : " + sum(5, 6))

    //Can also sum a list
    val personList = listOf(Person("Jack", "Hosking", 22),
            Person("Jack", "Hosking", 22),
            Person("Jack", "Hosking", 22)
    )

    //Example using map and sum()
    val totalAgeInPersonList1: Int = personList.map { it.age }.sum()
    println("Using Sum(): $totalAgeInPersonList1")

    //Example using sumBy()
    val totalAgeInPersonList2: Int = personList.sumBy { it.age }
    println("Using sumBy(): $totalAgeInPersonList2")

    //And a map
    val personMap = mapOf(
            1 to Person("Jack", "Hosking", 22),
            2 to Person("Jack", "Hosking", 22),
            3 to Person("Jack", "Hosking", 22)
    )

    val totalAgeInPersonMap1: Int = personMap.map { it.value.age }.sum()
    println("Using sum(): $totalAgeInPersonMap1")

    val totalAgeInPersonMap2: Int = personMap.map { it.value }.sumBy { it.age }
    println("Using sumBy(): $totalAgeInPersonMap2")
}