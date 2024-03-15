class dog(var name:String,var breed:String,var weight:Int) {

    fun move(movement:String) {
        println("The dog Is $movement")

    }
}

fun main() {
    var dog1 = dog("Murife","pitbull",68)
    var dog2 = dog("Bob","Bulldog",78)
    var dog3 = dog("Bosco","Rotweiler",90)

    println(dog1.breed)
    dog2.move("running")
    dog1.move("walking")
}