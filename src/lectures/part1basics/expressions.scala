package lectures.part1basics

object expressions extends App{
  val x = 1 + 2 // EXPRESSIONS
  println(x)

  println(2 + 3 * 4)
//  + - * / & | ^ << >> >>> (Right shift with zero extension)
//  tests for if 1 equals to x
  println(1 == x)

//  == != > >= < <=
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // a side effect
  println(aVariable)

//  instructions vs expressions
//  instructions are something you tell a computer to do
//  expressions are something that has a value or a type

//  IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  print(aConditionValue)

  var i = 0
  while (i < 10) {
    println(i)
    i +=1
  }
//  Everything in Scala is an expression

  val aWeirdValue = aVariable = 3 // Unit == void (Dont return anything meaningful)
  print(aWeirdValue)

//  side effects: prinln(), whiles, reassigning

//  code blocks
//  is an expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"

  }

  // 1. difference between "hello world" vs println("hello world")
  // hello world value String
  // println() is a Unit - prints to console
  // 2.
  val someValue = {
    2 < 3
  }
//  True

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
//  42 - code blocks will use the last expression so the if statement
//  is meaningless

 }
