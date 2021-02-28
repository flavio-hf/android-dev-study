// multi data types operations
fun main(args : Array<String>) {
    val name = "James"
    var num = 42
    println(name)
    println(num)
    // BUG: prinln(name+num) - Unresolved Reference
    println(name+num.toString())
    // the line above solves the problem converting var num to String type, matching the val name
}