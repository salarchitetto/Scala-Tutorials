package lectures.part2oop

object Object {
    //  SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY
    // DOESN'T KNOW ABOUT "STATIC"

  object Person { // type + only instance
    //"static" class level functionality
      val N_EYES = 2
      def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person  = new Person("Bobby")
    //Factory method
    }

  class Person(val name: String) {
    //instance-level functionality
  }

  //companions
  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    //Scala object is a Singleton Instance
    val mary = new Person("mary")
    val john = new Person("john")
    println(mary == john)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val bobby = Person.apply(mary, john)
    println(bobby)
  }
  //Scala Applications = Scala object with
  // def main(args: Array[String]): Unit



}
