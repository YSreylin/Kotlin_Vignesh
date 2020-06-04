
fun main(args: Array<String>) {

    print("Enter the size of the array: ")
    val size = readLine()!!.toInt()

    //Array1
    println("Enter the element of array1: ")
    var arr1 = Array(size){ readLine()!!.toInt()}


    //Array2
    println("Enter the element of array2: ")
    var arr2 = Array(size){ readLine()!!.toInt()}


    //Array result
    val res = arrayOfNulls<Int>(size)
    for(o in res.indices){
       res[o] = arr1[o]!!+arr2[o]!!
    }
    println("The result of Array 1 is :  ${arr1.contentToString()}")
    println("The result of Array 2 is :  ${arr2.contentToString()}")
    println("Result of two Array is   :  ${res.contentToString()}")

}


