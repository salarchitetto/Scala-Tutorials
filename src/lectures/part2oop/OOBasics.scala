package lectures.part2oop

object OOBasics extends App {

  // Instantiating a Class
  val person = new Person("John", 25)
  println(person.age)
//  println(person.name)
  println(person.x)
  person.greet("Sal")
}

// Creating a class
//Constructor
class Person(name: String, val age: Int) {
  //body

  //The below is a field
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  //overloading
  //defining methods with the same name but with different parameters
  def greet():Unit = println(s"Hi, I am ${name}")

  // multiple constructors

  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}

// TODO : novel and writer class
// writer: first name, surname, year
  // method full name

// novel: name, year of release, author
  // author age
  // is written by (AUTHOR)
  // copy (new year of release) = new instance of Novel



  //class parameters are not fields

