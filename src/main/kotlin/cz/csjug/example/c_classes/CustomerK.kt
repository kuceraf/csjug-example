package cz.csjug.example.c_classes

import java.lang.IllegalArgumentException
import java.util.*

/**
 * CONSTRUCTOR
 * A class in Kotlin can have a primary constructor and one or more secondary constructors.
 * Init block are used to initialize the class
 * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor
 *
 * PROPERTIES
 * Kotlin class doesn't have fields, only properties
 * The default implementation of Kotlin property includes
 * field and accessors (getter for val (read-only), and getter and setter for var)
 *
 *
 *
 */
data class CustomerK(val name: String, // primary constructor with declaration and initialization of properties
                     val yearOfBirth: Int) {

    constructor(name: String, // secondary constructor
                yearOfBirth: Int,
                socialSecurityNumber: String):this(name, yearOfBirth) {
        this.socialSecurityNumber = socialSecurityNumber // accessing socialSecurityNumber property
    }


    var socialSecurityNumber: String? = null
      set(value) {
          field = validateSN(value) // accessing backing field of the property
      }

    val age: Int
        get() {
            return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
        }


    private fun validateSN(value: String?): String {
        if(value == null || !value.startsWith("SN")) {
            throw IllegalArgumentException("Social Security Number should start with SN")
        }
        return value
    }
}

fun main(args: Array<String>) {
    val pepa = CustomerK("Pepa", 1980, "aaa")
    val lada = CustomerK( "Lada", 1990)

    pepa.socialSecurityNumber
    println(pepa)
}