

fun main() {
    //Start from the size
    print("Enter the size of Array : ")
    var size = readLine()!!.toInt()

    println("Enter a number! ")
    var arr = Array(size){readLine()!!.toInt()}

    println("Original Array is  : ${arr.contentToString()}")
    arr.sort()
    println("The sorted array is: ${arr.contentToString()}")
}
//import java.util.*
//fun main() {
//    val students = arrayOf(10,9,23,12,5,2,4,1)
//    println("Original array : ${Arrays.toString(students)}")
//    students.sortDescending()
//    println("Sorted array : ${Arrays.toString(students)}")
//}