fun main() {
    print("Enter the size of Array : ")
    var size = readLine()!!.toInt()
    println("Enter the element of Array !")
    var arr:Array<Int> = Array(size){ readLine()!!.toInt()}

    println("The original Array is : ${arr.contentToString()}")

   println("There are ${arr.count()} elements in Array!")
//    var even = arr.count { i -> i % 2 == 0 }
//    println("There are $even even number in the Array!")
    println("There are ${arr.count { j -> j%2 == 0 }} even number in the Array!")
    println("There are ${arr.count { j -> j%2 != 0 }} odd number in the Array!")
}