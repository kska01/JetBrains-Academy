fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()   

    println(beyondTheWall.sorted() == backToTheWall.sorted())
}