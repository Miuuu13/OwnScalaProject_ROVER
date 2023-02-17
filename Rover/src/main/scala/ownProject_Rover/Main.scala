package ownProject_MyRover

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello I will be a project soon!")

    val statRover1: StationaryRover = new StationaryRover("Charly", 1, 2, 3)
    statRover1.printPosition()

    val movRover1: MovingRover = new MovingRover("Runny", 0, 0, 0)
    movRover1.printPosition()
    //println(movRover1.move(1,2,3))
    val ananasCollect = movRover1.collect("ananas")
    println(ananasCollect)


    //enum example from ZT
    enum Slot {
      case VL, Break, Tutorial
    }
    import Slot.*

    val monday: Seq[Slot] = Seq[Slot](VL, Break, Tutorial, VL)

    val getInfo: String = monday.head match
      case VL => s"The lecture is in room 123."
      case Break => "relax"
      case Tutorial => "Check email for info about the room"

    println(monday)
    println(getInfo) //monday.head ===VL >>The lecture is in room 123.
  }

}
