package main

fun main() {
    /* VARIABLE INSTANTIATION */
    val pi = 3.14 // Creates an immutable value containing the first 2 digits of pi
    var myName : String = "Caleb" // Creates a string variable and assigns it my name

    /* 1ST OUTPUT */
    println("Hello my name is " + myName) // Prints out an introduction of my name
    println("My age * pi is: " + (21 * pi)) // Prints out my age multiplied by pi

    /* OPERATIONS */
    myName = "John" // Assigns a new name to myName variable

    /* 2ND OUTPUT */
    println()
    print("My name is not: " + myName) // Prints out a statement with a new false name

} // End of main.main function