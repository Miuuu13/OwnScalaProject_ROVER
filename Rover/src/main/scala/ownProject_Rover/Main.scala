package ownProject_Rover

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello I will be a project soon!")

    val statRover1: StationaryRover = new StationaryRover("Charly", 1, 2, 3)
    statRover1.printPosition()

    val movRover1: MovingRover = new MovingRover("Runny", 0, 0, 0)
    println(movRover1.move(1,2,3))
  }
}
