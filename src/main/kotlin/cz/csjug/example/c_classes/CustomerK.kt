package cz.csjug.example.c_classes

/**
 * Kotlin doesn't have fields, only properties
 *
 * The default implementation of Kotlin property includes
 * field and accessors (getter for val (immutable), and getter and setter for var)
 *
 * init block are used to initialize the class
 *
 *
 */
data class CustomerK(val cluid: String, // cluid is mandatory and can'nt change
                     var name: String, // name can change
                     val yearOfBirth: Int? = null // optional property with default value
)

fun main(args: Array<String>) {
    val pepa = CustomerK("aaa", "Pepa", 1980)
    val lada = CustomerK("bbb", "Lada")

    println(pepa)
    pepa.name = "Josef"
    println(pepa)
}