package lectures.part1basics

object stringOps extends App {

  val str: String = "bacon egg and cheeses are really good"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("bacon"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  // appending data
  println(str.reverse)
  println(str.take(2))

  // Scala Specific: String Interpolators
  //s-interpolators

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val greet = s"Hello, my name is $name and I am ${age + 1} years old"
  println(greeting)
  println(greet)

  //f-interpolators
  // This is for number precisions
  val speed = 5.2f
  val myth = f"$name can eat $speed%2.2f bacon strips per minute"
  println(myth)

  // Raw interpolator

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
  // The above will still print a new line
}
