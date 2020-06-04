fun isPrime(i:Int): Boolean {
    var factor = 0;
    for (j in 1..i){
        if(i%j==0){
            factor++
        }
    }
    return factor==2
}

fun main() {
    print("Enter the size : ")
    var size = readLine()!!.toInt()

    println("Enter number!")
    var arr:Array<Int> = Array(size){readLine()!!.toInt()}
    var count = 0
    for(i in arr){
        if(isPrime(i))
            count++
    }
    println("There are $count numbers are prime number!!")
}