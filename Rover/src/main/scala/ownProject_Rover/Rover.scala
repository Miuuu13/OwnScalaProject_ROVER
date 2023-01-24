package ownProject_Rover

abstract class Rover(val name: String, val x: Int, val y: Int, z: Int) {
  def printName(): Unit = println(s"My name is $name. I am a Rover.")
  def printStartingPosition(): Unit = println(s"My starting position: $x, $y, $z")


}


class StationaryRover(name: String, x: Int, y: Int, z: Int)
  extends Rover(name: String, x: Int, y: Int, z: Int){
  override def printName(): Unit = super.printName() + "I am a stationary rover."
  override def printStartingPosition(): Unit = println(s"My stationary position: $x, $y, $z - I can't move.")

}