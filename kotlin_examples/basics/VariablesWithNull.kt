package kotlin_examples.basics

fun main(args: Array<String>) {
    var name: String? = "Jack Hosking"
    var nameLength: Int

    // Only Safe ? or !! calls are allowed

    //Length or 0 if name is null
    nameLength = name?.length?: 0
    println(nameLength)

    name = null

    // Throw error when name is null
    // if name is not null then in the specific example the ? can be replaced by a dot-call
    // but in proper programs where you are unsure of the order of name being set - it is necessary to avoid error.
    nameLength = name?.length?: throw Error()
    println(nameLength)

}