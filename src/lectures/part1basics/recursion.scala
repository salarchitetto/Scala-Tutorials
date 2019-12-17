package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of "  + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  //  println(factorial(5000)) This will throw a stackoverflow because it can't hold this much memory
  //("Blows Up")

  def anotherFactorial(n: Int): BigInt = {

    @tailrec //tail recursive
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // Tail Recursion: use recursive call as the LAST Expression

    factHelper(n, 1)


    // When you need loops use tail recursion

  }
  println(anotherFactorial(5000))
  // This is a massive number
  @tailrec
  def con(n: Int, aString: String, accumulator: String): String =
    if (n <= 0) accumulator
    else con(n - 1, aString,  aString + accumulator)

  println(con(10, "test ", ""))

  def isPrime(n: Int): Boolean =  {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(2003))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      //n-1 and n-2
      if(i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2,1,1)
  }
  println(fibonacci(8))

}
