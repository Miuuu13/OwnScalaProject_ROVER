package ownProject_MyRover

import scala.collection.mutable.ArrayBuffer

abstract class MyRover(val name: String,
                     val x: Int,
                     val y: Int,
                     val z: Int) {
    /**Prints the name of a rover*/
  def printName(): Unit = s"My name is $name. I am a Rover."
  /**Prints the position of a rover*/
  def printPosition(): Unit = s"My starting position: $x, $y, $z"
  def canMove = false
}

class StationaryRover(name: String, x: Int, y: Int, z: Int)
  extends MyRover(name: String, x: Int, y: Int, z: Int) with canMeasureTemperature {
  override def printName(): Unit = s"My name is $name. I am a Rover." + "I am a stationary rover."
  override def printPosition(): Unit = println(s"My stationary position: $x, $y, $z - I can't move.")

  val tempCelcius: Int = 0
  //println(tempFahrenheit)

  }

class MovingRover(name: String, x: Int, y: Int, z: Int)
  extends MyRover(name: String, x: Int, y: Int, z: Int) with isCollecting(300){
  override def printName(): Unit = s"My name is $name. I am a Rover." + "I am a moving rover."
  override def printPosition(): Unit = println(s"My position: $x, $y, $z - But: I can move.")
  override def canMove = true

  }

trait isCollecting(initialEnergy: Int){
  /*representing the energy stored*/
  private var energy: Int = initialEnergy
  /*representing the weight in kg*/
  private var roverWeight = 100
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