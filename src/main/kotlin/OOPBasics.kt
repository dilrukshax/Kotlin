fun main(args: Array<String>) {


    val bird = Animals() // crate a class
    bird.sound = "chirp" // assign tha values
    bird.legs = 2
    println("sound = ${bird.sound}| legs = ${bird.legs}")

    val dog = Animal("bark", 4) // assign tha values using construct
    dog.getInfo()

}
//animals class
class Animals(){
    var sound:String = ""
    var legs:Int = 0

}


//animal class
class Animal(private var sound:String, private var legs:Int){ // Construct

    fun getInfo(){
        println("sound = ${sound}| legs = ${legs}")
    }
}

