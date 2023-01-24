package ownProject_Rover

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello I will be a project soon!")

    val rover1 = new Rover("Charly", 1,2,3)
    rover1.printStartingPosition()
  }
}
