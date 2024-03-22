fun main(args: Array<String>) {
    var x = 5
    val y = 3.0

    //Operation
    /*
    comments
     */
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("Result: $result")

    result -= 2
    println("Result: $result")

    result *= 2
    println("Result: $result")

    result /= 2
    println("Result: $result")

    result %= 2
    println("Result: $result")

    println("3 + 3 * 4 : ${3 + 3 * 4}")
    println("3 + 3 * 4 : ${(3 + 3) * 4}")

    x = 0
    println("x : ${x++}")
    println("x : ${++x}")

    println("x : ${x--}")
    println("x : ${--x}")

    val isActive = false
    if (isActive == true){// != not equal / == equal / < > less than grater then / ! not
        println("The User is Active")
    }else{
        println("The User is NotActive")
    }

    val isPlaying = true
    val score = 80
    if (isPlaying && score >= 100){
        println("Next Leval Open")
    }else{
        println("Still at the Same Lavel")
    }

    val num1 = 5
    val num2 = 4
    val text = if (num1 > 6 || num2 > 6){
        println("true")
        "this is text 1"
    }else{
        println("false")
        "this is text 2"
    }
    println(text)




}