import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {

    val file = File("C:/Users/Админ/Desktop/myfile2.txt")

    file.readFile(200)
}


infix fun File.readFile(size: Int){

    val reader = FileReader(this)
    val array = CharArray(size)
    val myArray: MutableList<Char> = mutableListOf()
    reader.read(array)
    for (char in array){
        if (char == '\u0000'){
            break
        }
        myArray.add(char)

    }
    println(myArray[0])
    println(myArray[1])
    println(myArray.last())
    println(myArray[myArray.size - 2])
    reader.close()
}