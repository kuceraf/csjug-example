package cz.csjug.example.b_functions

// param [op] is function that takes two Integers and return Integer
fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {

}

// function that matches the [op] pattern
fun sum(x: Int, y: Int): Int = x + y

fun main(args: Array<String>) {
    operation(1,2, ::sum)
}