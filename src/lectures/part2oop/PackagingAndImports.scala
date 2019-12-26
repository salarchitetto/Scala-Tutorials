package lectures.part2oop
import playground.{AnotherTest, Test => YEET}
// you can do playground._ to import all

import java.util.Date
import java.sql.{Date => SQLDate}

object PackagingAndImports extends App {
  //A bunch of definitions under the same name

  //package members are accesible by their simple name
  val writer = new Writer("ye", "Sal", 2020)
  val ye = new YEET

  // packages are in hierarchy
  // Matching folder structure

  // package object
  //The package object can be snagged from everywhere in this package
  sayHello
  SPEED_OF_LIGHT

  val yeet = new AnotherTest

  // Use fully qualified name
  val d = new Date
  val sqlDate = new SQLDate(2018, 5,4)
  // 2. Use aliasing

  // default Imports
  // java.lang - contains String, Object, Exceptions
  // Scala - Int, Nothing, Function, the goods
  // scala.Predef - println, ???

}
