fun main(args: Array<String>) {
    val text : String? = "name" // null

    println(text)
    
    println(text?.length)

    if (text != null){
        println(text.length)
    }else{
        println("this Variable is NULL")
    }

}