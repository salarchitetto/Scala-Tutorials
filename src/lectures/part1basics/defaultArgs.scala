package lectures.part1basics

object defaultArgs extends App {

  def tFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else tFact(n - 1, n * acc)

  val fact10 = tFact(10)

  def savePicture(width: Int, height: Int, format: String = "jpeg"): Unit =
    println("Saving Picture")

  //savePicture(width = 800, height = 600)
  savePicture(800, 600)
    //  pass in every leading arguments
    // name the arguments


}
