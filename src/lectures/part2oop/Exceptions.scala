package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  //println(x.length)
  //The above will crash with a nullpointerexception
  // throwing and catching exceptions

  // 1. Throwing exceptions
  //val aWeirdValue: String = throw new NullPointerException //intentionally crash the program
  // Throwable classes extend the throwable class
  // Exceptions and Error are the major throwable subtypes

  // 2. How to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No Int for you")
    else 42

  val potentialFail = try {
    // code that might fail
    getInt(false)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // code that will get executed NO MATTER WHAT
    // this is optional
    // does not influence the return type of  this expression
    // Use finally only for side effects (Logging for example)
    println("Finally, this worked")
  }
  println(potentialFail)

  // 3. How to define your own exceptions
  class myExceptions extends Exception
  val exception = new myExceptions

  throw exception // created my own exception which will blow up the JVM

  /*
   1. crash your program with an OutOfMemoryError
   2. Crash with SOError
   3. PocketCalculator
      - add
      - subtract
      - multiplying
      - divide

      throw
        -overflowexception if add exceeds int.max_value
        -underflowexception if subtract exceeds int.min_value
        -mathcalculationexceptions for divide by zero
   */

  //OOM
  //val array = Array.ofDim(Int.MaxValue)

  //SO
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite

}
