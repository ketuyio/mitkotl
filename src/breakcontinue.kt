fun main() {
    //break statements

    for (number in 30..40){
        if (number == 35){
            break
        }
        println(number)
    }

    //continue statements

    for (character in 'a'..'f') {
        if (character == 'd') {
            continue
        }
        println("Character is $character")
    }

    }