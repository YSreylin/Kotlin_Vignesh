fun main() {
    print("Enter the size of array : ")
    var size = readLine()!!.toInt()
    println("Enter a number !")
    var arr:Array<Int> = Array(size){readLine()!!.toInt()}
    println("Original array is   : ${arr.contentToString()}")
    arr.sortDescending()
    println("Descending array is : ${arr.contentToString()}")
}