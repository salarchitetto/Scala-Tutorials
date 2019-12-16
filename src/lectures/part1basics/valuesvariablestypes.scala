package lectures.part1basics

object valuesvariablestypes extends App {

//  Val types are optional
//  Compiler can infer types
//  val x = 10

  //  vals cannot be reassigned / immutable
  //  x = 2

  val x: Int = 500
  println(x)


//  Semi-Colons are allowed but not necessary
  val bacon: String = "BaconEggNCheese"
  println(bacon)

  val aBoolean: Boolean = true
  val aBoolean2: Boolean = false

  val aChar: Char  = 'a'

  val anInt: Int = x
//  short have the size of an Int
  val aShort: Short = 21238
//  Need to put an L after a long integer
  val aLong: Long = 5678909878939729L
//  Need to put an f to specify it is a float
  val aFloat: Float = 1.3f
  val aDouble: Double = 13.54131

//  Variables in Scala
//  can be reassigned
//  used for side effects
  var aVariable: Int = 4
  aVariable = 5

}
