package kotlin_examples.classes

open class Greeting(val morning: String) {
    open fun goodMorning() = "Good morning"
}

class GermanGreeting(morning: String) : Greeting(morning) {
    override fun goodMorning() = "Guten Morgen"
}