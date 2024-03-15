class person{

    //attributes/properties/characteristics
    var name = "Tracy"
    var age = 32
    var gender = "Female"

    //behaviour/method
    fun walk(){
        println("Person is walking")
    }

}

fun main() {
    var doctor = person()
    println(doctor.name)

    doctor.walk()

}