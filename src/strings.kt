fun main() {
    var greetings = "Hello world"
    var firstname = "Elias"
    var lastname = "eMobilis"
    //Strings concatenation
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //Accessing a character in a string
    println(greetings[6])

    //Determining the index position of a character
    println(greetings.indexOf('H'))
    println(greetings.indexOf("world"))

    //size of string
    println(greetings.length)

    //Modifing a string
    println(greetings.uppercase())

    //string interpolation\
    println("Hello there, my name is $firstname $lastname")


}