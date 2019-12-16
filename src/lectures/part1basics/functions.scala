package lectures.part1basics

object functions extends App {

    def aFunction(a: String, b: Int): String  = {
      a + " " + b // String Concat
    }

    println(aFunction("hello", 567))

    def aParameterless(): Int = 42
    println(aParameterless())

    def aRepeatedFunction(aString: String, n: Int): String = {
  //    Recursion
      if(n == 1) aString
      else aString + aRepeatedFunction(aString, n - 1)
    }
  println(aRepeatedFunction("hello ", 3))
  //  WHEN YOU NEED LOOPS USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit =
    println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and i'm " + age + " years old"
  }
  println(greeting("Sal", 25))

  def factorial(n: Int): Int =
    if(n == 1) n
    else n * factorial(n - 1)

  print(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(11))
}
