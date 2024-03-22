fun main() { // this is main function
    println("Hello World!")

    var w = 10 //Mutable variable
    w = 30
    println(w)

    val q = 25 //Immutable variable
    println(q)

    val x = 10
    val y = 2.3
    val z = 2.5f //float variable
    val b = 4785L //long variable
    val a = "jon"
    println(x + y + z )
    println("My Name is  $a")//Concatenate

    //if condition

    val mark = -1

    if (mark < 0){
        println("error mark > 0")
    }else if (mark < 45){
        println("F")
    }else if (mark <= 65){
        println("C")
    }else if (mark < 75){
        println("B")
    }else if (mark < 100){
        println("A")
    }else{
        println("error mark > 100")
    }

    println("when condition it like a switch case")

    // when condition it like a switch case

    val color = "red"

    when(color){
        "white" -> println("this text shoud black")
        "red" -> println("this text shoud white")
        "black" -> println("this text shoud red")
    }

    println("array and for loop")


    val marks = arrayOf(23,54,65,85,20,100,1008,23,86) //array

    for (mark in marks){ // for loop
        println("grade is ${generateGrade(mark)}")
    }

    println("\n")
    println("grade is ${generateGrade(85)}")
    println("grade is ${generateGrade(32)}")
    println("grade is ${generateGrade(105)}")


    //arrays using mutable list



    val score = mutableListOf<Int>()

    println("pless enter the mark , exit pass q")
    while (true){
        val input = readln()
        if (input == "q"){
            break
        }
        score.add(input.toInt())
    }

    for (scores in score){ // for loop
        println("the grade is ${generateGrade(scores)}")
    }

}


// separate function

fun generateGrade (marks:Int): String {               //creating function
    return when(marks){                               // when condition
        in 0..44 -> "F"
        in 45..64 -> "C"
        in 65..74 -> "B"
        in 75..100 -> "A"
        else -> "error"
    }
}