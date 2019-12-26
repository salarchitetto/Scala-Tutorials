package lectures.part2oop

object Generics extends App {
  //Learning about generics

  class MyList[+A] {
    //Type "A" Denotes a generic Type
    // use the Type A inside the class definition
    def add[B >: A](element: B): MyList[B] = ???

    /*
      a = Cat
      b = Animal
     */

  }

  class MyMap[Key, Value] {

  }
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes list[cat] extends list of animal
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)???  HARD QUESTION. => we return a list of animals

  // 2. NO list of cats and list of animals are two separate things
  // INVARIANCE

  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. hell No, CONTRAVARIANT

  class Trainer[-A] // Contravariant list
  val contravariantList: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

//  class Car
  //The below will not work since car is not of type Animal
//  val newCage = new Cage(new Car)


  // expand MyList to be Generic


 }
