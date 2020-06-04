fun main() {
    print("Enter the size of array :")
    var size = readLine()!!.toInt()
    println("Enter a element for Array!")
    var arr: Array<Int> = Array(size){readLine()!!.toInt()}
    println("Original Array is : ${arr.contentToString()}")
    arr.sort()
    println("Sorted Array is   : ${arr.contentToString()}")
}