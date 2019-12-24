package playground
import scala.math._
import scala.util.control.Breaks._

object ScalaPlayground extends App {

  val calc = new Calculator()

  calc.userOptions()

  while (true) {
    val input = scala.io.StdIn.readLine()
    if (input == "quit"){
      break
    }
    val userOption = calc.userInput(input)
  }
}

class Calculator() {

  def askForNumbers(): String = {
    /**
     * Asks user for two numbers
     * returns the numbers in form of a String
     */
    println("Please input two numbers to the Console: ")

    val num = scala.io.StdIn.readLine()
    val finNum = num.toString
    finNum
  }

  def readInNumbers(): (Int, Int) = {
    /**
     * Here we take the return value from askForNumbers()
     * and split them into
     */
    val listNum: String = askForNumbers()
    val Array(x, y) = listNum.split("\\s+").map(_.toInt)
    (x, y)
  }

  def wouldYouLikeToContinue(): String = {
    val cont: String = "Would you like to Continue? "
    cont
  }

  def userOptions(): Unit = {
    println("Please Choose ONE of the following options (Enter Number)")
    println("To quit, please type 'quit'")
    println("1. Multiplication")
    println("2. Division")
    println("3. Addition")
    println("4. Subtraction")
    println("5. Square Root")
  }

  def userInput(input: String) = {

    if (input == "1") {
      multiplication()
      println("Please choose a new option from the above")
    }

    else if (input == "2") {
      division()
      println("Please choose a new option from the above")
    }

    else if (input == "3") {
      addition()
      println("Please choose a new option from the above")
    }

    else if (input == "4") {
      subtraction()
      println("Please choose a new option from the above")
    }

    else if (input == "5") {
      squareRoot()
      println("Please choose a new option from the above")
    }
  }

  def multiplication(): Unit = {
    /**
     * Multiplies two numbers together
     */

    val Array = readInNumbers()

    println(Array._1 * Array._2)
  }

  def division(): Unit = {
    /**
     * Divides two numbers
     */
    try
      {
        val Array = readInNumbers()
        println(Array._1 / Array._2)
      }
    catch
      {
        case x: ArithmeticException => {
          println("Cant divide by zero! ")
        }
      }
  }

  def addition(): Unit = {
    /**
     * Adds two numbers
     */

    val Array = readInNumbers()

    println(Array._1 + Array._2)
  }

  def subtraction(): Unit = {
    /**
     * Subtracts two numbers
     */

    val Array = readInNumbers()

    println(Array._1 - Array._2)
  }

  def squareRoot(): Unit = {
    val Array = readInNumbers()

    println(s"The square root for ${Array._1} is ${sqrt(Array._1)}")
    println(s"The square root for ${Array._2} is ${sqrt(Array._2)}")
  }

  def main(ars: Array[Int]): Unit = {
    val calc = new Calculator()

    calc.userOptions()

    val input = scala.io.StdIn.readLine()
    while (true) {

      val userOption = calc.userInput(input)
    }
  }
}




