// consider this: «fun main(args : Array<String>)», it's taught this way at SoloLearn and though either Intellij IDEA or VS Code find any problem, it doesn't run on terminal and on Kotlin playground. I couldn't run the program without it either on terminal, but it worked on Playground. The error presented says that main never takes arguments.

/*
"In Kotlin versions earlier than 1.3, the main function must have a parameter of type Array<String>." 
(https://play.kotlinlang.org/byExample/01_introduction/01_Hello%20world)
*/
fun main() {
    println("'Sup, Android? \n I'm coming for you!")

}