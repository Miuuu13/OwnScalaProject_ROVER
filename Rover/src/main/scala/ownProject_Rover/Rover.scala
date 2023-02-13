package ownProject_Rover

abstract class Rover(val name: String, val x: Int, val y: Int, z: Int) {
  /**Prints the name of a rover*/
  def printName(): Unit = println(s"My name is $name. I am a Rover.")
  /**Prints the position of a rover*/
  def printPosition(): Unit = println(s"My starting position: $x, $y, $z")
  def canMove = false
}

class StationaryRover(name: String, x: Int, y: Int, z: Int)
  extends Rover(name: String, x: Int, y: Int, z: Int) with canMeasureTemperature {
  override def printName(): Unit = super.printName() + "I am a stationary rover."
  override def printPosition(): Unit = println(s"My stationary position: $x, $y, $z - I can't move.")

  val tempCelcius: Int = 0
  //println(tempFahrenheit)

  }

class MovingRover(name: String, x: Int, y: Int, z: Int)
  extends Rover(name: String, x: Int, y: Int, z: Int) with isCollecting{
  override def printName(): Unit = super.printName() + "I am a moving rover."
  override def printPosition(): Unit = println(s"My position: $x, $y, $z - But: I can move.")
  override def canMove = true

  }

trait isCollecting{
  val canCollect: Boolean = true
  def collect(item: String): Seq[String] = Seq(item)
  def collect(items: Seq[String]): Seq[Seq[Char]] =Seq(items.flatten)
}

trait canMeasureTemperature{
  protected val tempCelcius: Int
  val canMeasureTemperature: Boolean = true
  def tempCelsius: Int = tempCelcius
  def tempFahrenheit: Double = tempCelcius * 33.8
}