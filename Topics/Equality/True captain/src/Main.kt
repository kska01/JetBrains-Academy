// you do not need to understand how it works, ignore it
class Pirate(name: String) {
    var name: String = name
        private set    
}
// Do not touch the lines above

fun main() {
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    // put your code here
    captain = Pirate("Jack Sparrow")
    println(captain.name)

}