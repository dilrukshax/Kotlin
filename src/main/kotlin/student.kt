fun main(){

    val students = mutableListOf<Student>()

    while (true){
        println("Enter student ID:")
        val id = readln()

        println("Enter student Name:")
        val name = readln()
        students.add(Student(id,name))

        println("Do you want to continue? (y/n)")

        val input = readln()
        if(input== "n"){
            break
        }
    }

    for(student in students){
        println(" ${student.studentID} - ${student.name} ")
    }
}

class Student (val studentID:String, val name:String)