package lectures.part2oop

object AbstractDataTypes extends App{
  // abstract members
  //unimplemented classes

  abstract class Animal {
    val creatureType: String = "wild" //unimplemented
    def eat: Unit //unimplemented
  }

  class Dog extends Animal {
    override val creatureType: String = "Dog"
    override def eat: Unit = println("EATS FOOD")
  }

  //traits
  trait ColdBlooded
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Fresh Meat"
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"

    def eat: Unit = "EAT"

    def eat(animal: Animal): Unit = println(s"crocodile eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)

  //traits vs abstract classes
  // 1 -traits can't have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class is a type of thing
}
