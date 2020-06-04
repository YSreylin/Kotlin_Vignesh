fun main() {
    print("Enter size of array : ")
    var size = readLine()!!.toInt()
    println("Enter a number!")
    var arr : Array<Int> = Array(size){readLine()!!.toInt()}
    println("The result of array is : ${arr.contentToString()}")
    println("The result of sum all elements in the array is : ${arr.sum()}")
    println("The average is : ${arr.average()}")
}