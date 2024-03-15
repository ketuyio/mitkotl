//Parent class/base class/super class
open class animal{
    var age = 3
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//child classes
open class duck:animal() {
    var colour = "white"
    fun sound(){
        println("The duck is clarking")
    }

}
class fish:duck(){
    var hasscales = true
    var hasfins = true
    fun eat(){
        println("Fish is eating")
    }

}

fun main() {
    var elephant = animal()

    var ducklin = duck()
    ducklin.move("swimming")
    ducklin.colour
    var nileperch = fish()

}