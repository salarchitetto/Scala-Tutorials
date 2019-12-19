package lectures.part2oop

object OOBasics extends App {

  // Instantiating a Class
  val person = new Person("John", 25)
  println(person.age)
  //  println(person.name)
  println(person.x)
  person.greet("Sal")

  val author = new Writer("Sal", "Architetto", 25)
  val novel = new Novel("Yeet", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(author.FullName())

  val counter = new Counter(0)
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print

}

// Creating a class
//Constructor
class Person(name: String, val age: Int) {
  //body
  //class parameters are not fields

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

class Writer(firstName: String, lastName: String, val year: Int) {
  def FullName(): String =
    s"The authors full name is: ${this.firstName + " " + this.lastName}"
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int) {

  def inc = {
    println("Incrementing...")
    new Counter(count + 1)
  } //immutability

  def dec = {
    println("Decrementing...")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print() = println(count)

  //method that returns the current count

}
