fun main() {

    //predefined functions
    var y = Math.sqrt(169.0)
    println("The squareroot of 169.0 is$y")

    var x = Math.min(45,12)
    println("Minimum value is $x")

     var z = Math.max(45,12)
    println("Maximum value is $z")

    var a = Math.round(67.34)
    println(a)

    name()
    quotient(12,4)
    developers("Elias",23)


}
//user defined functions
fun name() {
    println("Elias")
}
fun quotient(num1:Int, num2:Int) {
    println(num1 / num2)
}
fun developers(name:String,age:Int){
    println("$name is $age years old")
}
