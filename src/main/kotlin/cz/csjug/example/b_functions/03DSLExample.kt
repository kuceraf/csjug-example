package cz.csjug.example.b_functions

import java.sql.SQLException

fun transaction(db: Database, code: () -> Unit) {
    try {
        db.connect()
        code() // execute the code
        db.commit()
    } catch (e: SQLException) {
        db.rollback()
    }
}

class Database{
    fun connect() {
        println("Connecting to DB")
    }
    fun rollback() {
        println("Rolling back changes in DB")
    }
    fun commit() {
        println("Committing changes into DB")
    }
}

/**
 * Basic example of using Kotlin to create DSL
 * more examples at:
 * https://kotlinlang.org/docs/reference/type-safe-builders.html
 */
fun main(args: Array<String>) {
    val db = Database()
    // calling function feels like DSL
    transaction(db) {
        println("Manipulating with data in DB")
    }
}

