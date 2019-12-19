package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"Bacon Egg N Cheese"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  // infix notation = operator notation (Syntactic Sugars)

  // "Operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  //All operators are methods
  //Akka actors have ! or ?

  //Prefix Notations
  val x = -1
  val y =1.unary_-
  // unary_ prefix only works with _+ ~ !

  println(!mary)

  //Postfix notation
  println(mary.isAlive)
  println(mary isAlive) //postfix

  // apply

  println(mary.apply())
  println(mary()) // this is the same as above line of code
  println(tom())

}