package kotlin_examples.classes

class Identification(var name: String, var surname: String) {
    var fullName: String
    get() = "$name $surname"
    set(value) {
        val(first, rest) = value.split(" ", limit = 2)
        name = first
        surname = rest
    }
}