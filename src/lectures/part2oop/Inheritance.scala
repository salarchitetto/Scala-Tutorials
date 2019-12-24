package lectures.part2oop

object Inheritance extends App {

  //single class inheritance
  class Animal {
    val creatureType = println("wild")
    def eat = println("Eats Food")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)


  //overriding
  class Dog extends Animal {
    override val creatureType: Unit = println("Not Wild")
    override def eat: Unit = {
      super.eat
      println("EATING")
    }
  }

  val dog = new Dog
  dog.eat
  dog.creatureType

 //type substitution   (Polymorphism)
 val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  // Super (check above)
  // preventing overrides
  // 1 - final
  // 2 - use final on the entire class
  // 3 - seal the class  = extends classes in this file
  // but prevent extention in other files
}
