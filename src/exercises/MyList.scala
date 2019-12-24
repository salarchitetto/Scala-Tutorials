package exercises

abstract class MyList {
  /*
    head = first element of this list
    tail = remainder of the list (Pointer)
    isEmpty = boolean - is this list empty
    add(int) = new list with this element added
    toString = override, returns a string representation of the list
   */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}
