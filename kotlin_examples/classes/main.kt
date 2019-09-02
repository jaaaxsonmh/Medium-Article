package kotlin_examples.classes

fun main(args: Array<String>) {
    val jack = Person("Jack", "Hosking", 22)

    //toString to display all primary constructor properties
    println(jack.toString())

    //can access firstname, age, and others without calls to a "getAge()" method
    println("I am ${jack.firstName} and I am ${jack.age} years old")

    // equals to compare all primary constructor properties
    println(jack == Person("Jack", "Hosking", 22))
    println(jack == Person("Jack", "Hosking", 24))

    // Hashcode on all primary constructor properties
    println(jack.hashCode() == Person("Jack", "Hosking", 22).hashCode())
    println(jack.hashCode() == Person("Jack", "Hosking", 24).hashCode())

    // copy object and change properties
    val tim = jack.copy(firstName = "tim", lastName = "Manson")
    println(tim.toString())

    val jacksID = Identification(jack.firstName, jack.lastName)
    println(jacksID.fullName)
}
