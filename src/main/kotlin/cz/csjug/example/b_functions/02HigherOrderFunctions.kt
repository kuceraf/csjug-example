package cz.csjug.example.b_functions

// parameter [operator] is function that takes one Integer and returns Integer
fun unaryOperation(x: Int, operator: (Int) -> Int): Int {
    return operator(x)
}

// function that matches the [operator] pattern
fun square(x: Int): Int {
    return x * x
}

fun main(args: Array<String>) {
    println(
            unaryOperation(2, ::square) // referencing function by name
    )

    unaryOperation(2, { x: Int -> x * x})   // passing lambda (long way)
    unaryOperation(2, {it * it})            // in single parameter lambda use "it"
    unaryOperation(2) {it * it}             // if last parameter is function, place is outside of parenthesis
}