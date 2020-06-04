
fun main() {
    print("Enter the size of Array :")
    var size = readLine()!!.toInt()
    println("Enter a element for Array !")
    var arr:Array<Int> = Array(size){ readLine()!!.toInt()}
    println("Original array is : ${arr.contentToString()}")

    var first= arr.filter { j -> j%2 != 0 }
    var second= arr.filter { i ->  i%2 == 0 }
    println("The first half of odd element is   : $first")
    println("The second half of even element is : $second")

}