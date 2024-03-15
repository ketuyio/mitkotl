import java.util.Scanner

fun main() {
     var reader = Scanner(System.`in`)

    print("Enter firts number:")
    var day = reader.nextInt()

    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 ->  "Thursday"
        5 -> "Friday"
        else -> "Invalid day of the week"

    }
    println("the day is $result")
}