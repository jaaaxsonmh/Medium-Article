package kotlin_examples.classes

// You can just have a parameter that will accept a morning string, but if you had a lot of greetings (times of days) would be messy
open class Greeting {
    open fun goodMorning() = "Good morning"
}

class GermanGreeting : Greeting() {
    override fun goodMorning() = "Guten Morgen"
}