fun main(args: Array<String>) {
    val alarm = 7

    when (alarm){
        in 1..10 -> {
            println("the number in range 1..10")
        }
        12,7,14 -> {
            println("The Time Is : $alarm")
        }
        else -> {
            println("The Time Is : $alarm")
        }
    }
}