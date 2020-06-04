fun main() {
    print("Enter the size of Array : ")
    var size = readLine()!!.toInt()
    println("Enter the element of Array ! ")
    var arr:Array<Int> = Array(size){ readLine()!!.toInt()}

    println("Original Array is : ${arr.contentToString()}")
    arr.reverse()
    print("Reversed Array is : ${arr.contentToString()}")
}