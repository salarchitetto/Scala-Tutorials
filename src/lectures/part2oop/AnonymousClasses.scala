package lectures.part2oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit = {

    }
  }
  //Anonymous Class

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("eating stuff")
  }
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi my name is ${name}")
  }
  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi my name is Jim ")
  }

}
