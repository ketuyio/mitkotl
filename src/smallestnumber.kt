import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    print("Enter firts number:")
    var first = input.nextInt()

    print("Enter second number:")
    var second = input.nextInt()

    print("Enter third number:")
    var third = input.nextInt()

    if (first < second && first< third){
        println("$first is the smallest number")

    }
    else if(second < first && second < third){
        println("$second is the smallest number")
    }
    else {
        println("$third us the smallest number")
    }

}