package lectures.part2oop

object CaseClasses extends App {
  /*
  equals, hash codes, toStrings
  setting defaults in one go
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("jim", 34)
  println(jim.name)

  // 2. sensible toString representations
  //the below will turn jim into to string

  println(jim)

  // 3. equals and hashcode implemented out of the box
  val sal = new Person("jim", 34)
  println(sal == jim)

  // 4. case classes have copy methods
  val dan = jim.copy(age = 45) // creates a new instance of this case class
  println(dan)

  //5. case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 24) //dont need to use new use this

  // 6. case classes are serializable
  // Akka framework

  // 7. Case classes have extractor patterns = ccs can be used in Pattern Matching

  case object UnitedKingdom {
    def name: String = "The UK and GB and NI"
  }

}
