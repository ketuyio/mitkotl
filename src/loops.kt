fun main() {
    //while loop
    var number = 20
    while (number <= 25){
        println("Number is $number")
        number++
    }

    //decrement
    var num = 100
    while (num >=95){
        println("Number is $num")
        num--
    }

    //Do--while loop
    var x = 34
    do {
        println(x)
        x++

    }while (x <= 20)

    //For loop
    var devices = arrayOf("Laptop","Phone","Tablet")
    for (device in devices){
        println("Device is $device")
    }

    var marks = arrayOf(74,79,75,68)
    for (mark in marks){
        println("Mark is $mark")
    }

    for (mynumber in 50..60){
        println(mynumber)
    }
    for (myletters in 'a'..'d'){
        println(myletters)
    }
}