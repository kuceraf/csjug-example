package cz.csjug.example.b_functions

// Top level function
// with default parameters
fun printDetail(name: String,
                email: String,
                phone: String = "NA"): Unit {
    println("name: $name, email: $email, phone: $phone")
}

fun main(args: Array<String>) {
    // named parameters
    printDetail(email = "filip@mail.com", name = "Filip")
}