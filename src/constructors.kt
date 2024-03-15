class employee(var firstname:String,var age:Int,var gender:String,var position:String,var salary:Double){
  fun role(task:String) {
      println("THe role is $task")

  }


}

fun main() {
    var employee1 = employee("Faith",32,"Female","First",2300.00)
    var employee2 = employee("Kate",32,"Female","Second",43000.00)
    var employee3 = employee("James",43,"Male","Third",32000.00)

    println(employee1.firstname)
    println("Emplyee1 is ${employee1.age} years old")


}