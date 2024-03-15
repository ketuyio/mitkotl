fun main() {
    var languages = arrayOf("Kotlin","Python","Java","CSS")
    println(languages[1])

    languages[2] = "C++"
    println(languages[2])

    //accessing elements
    for (x in languages){
        println(x)
    }

}