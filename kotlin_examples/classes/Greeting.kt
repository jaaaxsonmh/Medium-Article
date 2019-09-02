package kotlin_examples.classes

// You can just have a parameter that will accept a morning string
open class Greeting {
    open fun goodMorning() = "Good morning"
}

class GermanGreeting : Greeting() {
    override fun goodMorning() = "Guten Morgen"
}