fun main() {
    print("Enter range of Array : ")
    var size = readLine()!!.toInt()
    println("Enter a element !")
    var arr = Array(size){ readLine()!!.toInt()}
    println("Enter a number to search in array!")
    var user = readLine()!!.toInt()
    var so = if (user in arr) "Number $user is in array and location is ${arr.indexOf(user)}" else "Nothing"
    println(so)
}
