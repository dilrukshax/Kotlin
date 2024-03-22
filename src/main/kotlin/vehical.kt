fun main(){
    val car1 = vehical("toyota", "coralle")

    car1.travel()
    car1.getInfo()

    val car2 = ElectricVehicle("nissan", "leaf")

    car2.travel()
    car2.getInfo()
    car2.charge()

    val plane1 = Airplanes("boeing", "Airbus")
    plane1.travel()

}

open  class vehical(private val manufacture:String, private val model:String) { // inheritens
    open fun travel(){ //
        println("$model is driving")
    }
    fun getInfo(){
        println("$manufacture : $model")
    }
}

class ElectricVehicle(private val manufacture:String, private val model:String):vehical(manufacture,model){
    fun charge(){
        println("$manufacture $model is charging")
    }
}

class Airplanes (private val manufacture:String, private val model:String):vehical(manufacture,model){
    override fun travel() {
        println("$model is flying")
    }

}