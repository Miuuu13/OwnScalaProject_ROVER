package ownProject_Rover

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello I will be a project soon!")

    val statRover1: StationaryRover = new StationaryRover("Charly", 1, 2, 3)
    statRover1.printStartingPosition()
  }
}
