import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    print("Enter n1:")
    var n1 = input.nextInt()

    print("Enter n2:")
    var n2 = input.nextInt()

    print("Enter operator :")
    val choice = input.next()[0]


    val result = when(choice){
        '+' -> n1 + n2
        '_' -> n1 - n2
        '/' -> n1 / n2
        '*' -> n1 * n2
        '%' -> n1 % n2
        else -> {
            System.err.println("Not valid operation")
            return
        }
    }
    println(result)

}