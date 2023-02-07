package ownProject_Rover

//-----------------ROVERS-------------------------------------------------

/** Abstract class that represents a Rover without specification. */
abstract class Rover(val name: String, val x: Int, val y: Int, z: Int) {
  /**Method for printing the name.*/
  def printName(): Unit= println(s"My name is $name. I am a Rover.")
  /**Method for printing the position (not defined).*/
  def printPosition(): Unit //= println(s"My starting position: $x, $y, $z")

}

/** Class representing a stationary rover. */
class StationaryRover(name: String, x: Int, y: Int, z: Int)
  extends Rover(name: String, x: Int, y: Int, z: Int){
  /**Method for printing the name.*/
  override def printName(): Unit = super.printName() + "I am a stationary rover."
  /**Method for printing the position.*/
  override def printPosition(): Unit = println(s"My stationary position: $x, $y, $z - I can't move.")

}

/** Class representing a moving rover. */
class MovingRover(name: String, x: Int, y: Int, z: Int)
  extends Rover(name: String, x: Int, y: Int, z: Int) {

  /**Method for printing the name.*/
  override def printName(): Unit = super.printName() + "I am a moving rover."
  /**Method for printing the current position.*/
  override def printPosition(): Unit = println(s"My current position: $x, $y, $z - I can move.")
  /**Methods for moving
   * Up +z, Down impossible!
   * East/Left +x, West/Right-x
   * North/Front +y, South/Back -y
   * @param xMove: how much the rover moves along x achsis
   * @param yMove: how much the rover moves along y achsis
   * @param zMove: how much the rover moves along z achsis
   * @throws IllegalArgumentException if zMove is negative
   */
  def move(xMove: Int, yMove: Int, zMove: Int): MovingRover = {
    //if (zMove < 0) then throw IllegalArgumentException("Rovers can't go under earth!")
    require(zMove > 0)
    new MovingRover(this.name, x + xMove, y + yMove, z + zMove)
    }




}