import java.awt.GraphicsDevice
import java.util.Scanner

fun main() {
     var reader = Scanner(System.`in`)

    print("Enter Marks:")
    var mark= readLine()!!.toInt()

    var Grade = when(mark){
        in 85..100 -> "A"
        in 74..84 -> "B"
        in 54..73 -> "C"
        in 34..53 ->  "D"
        in 0..33 -> "E"
        else -> "Invalid Mark"

    }
    println("The grade is $Grade")
}