package ownProject_Rover

import scala.collection.mutable.ArrayBuffer
//package week01.rover


/** The execution of the program starts by calling this method. */
@main def entryPoint(): Unit = {
  // Let's create two rovers!
  val rover1 = new Rover("curiosity", 0, 0, 100.0, 1300)
  val rover2 = new Rover("spirit", 10, 10, 100.0, 820)

  // Time to create a few items
  val rock = new Rock(Material.Granite, 10)
  val container = new Container(Fluid.Water, 20)

  // Let's pickup these items and print the log
  rover1.pickupItem(rock)
  rover1.pickupItem(container)
  rover1.printLog()

  // Dropping an item
  rover1.dropItem()
  rover1.printLog()
}

/** A class representing a rover
 *
 * @param name the name of the rover
 * @param x the current x-position of the rover
 * @param y the current y-position of the rover
 * @param energy the remaining energy of the rover
 * @param weight the current total weight of the rover
 */
class Rover(val name: String,
            private var x: Int,
            private var y: Int,
            private var energy: Float,
            private var weight: Float) {

  // constants that define the energy consumption
  private val MoveEnergy: Float = 10
  private val PickupEnergy: Float = 20
  private val DropEnergy: Float = 5

  private val items: ArrayBuffer[Item] = new ArrayBuffer()
  private val logBuffer: ArrayBuffer[String] = new ArrayBuffer()

  /** Moves the rover one step towards east */
  def moveEast(): Unit = {
    payEnergy(MoveEnergy)
    x += 1
    logged("E")
  }

  /** Moves the rover one step towards west */
  def moveWest(): Unit = {
    payEnergy(MoveEnergy)
    x -= 1
    logged("W")
  }

  /** Moves the rover one step towards north */
  def moveNorth(): Unit = {
    payEnergy(MoveEnergy)
    y += 1
    logged("N")
  }

  /** Moves the rover one step towards south */
  def moveSouth(): Unit = {
    payEnergy(MoveEnergy)
    y -= 1
    logged("S")
  }

  /** Picks an item up from the ground
   *
   * @param item the item to pickup
   */
  def pickupItem(item: Item): Unit = {
    payEnergy(PickupEnergy)
    items.append(item)
    logged("Pickup " + item)
    weight += item.weight
  }

  /** Drops an item to the ground if the rover contains one
   *
   * @return Some(item) or None
   */
  def dropItem(): Option[Item] = {
    payEnergy(DropEnergy)
    if (items.nonEmpty) { // same as !items.isEmpty
      val item = items.remove(0)
      logged("Dropped " + item)
      weight -= item.weight
      Some(item)
    } else {
      logBuffer.append("Nothing to drop!")
      None
    }
  }

  /** Adds a new log entry to the log
   *
   * @param s the string representing the new log entry
   */
  private def logged(s: String): Unit = logBuffer.append(s)

  /** Return a copy of the log
   *
   * @return a copy of the log
   */
  def log: Seq[String] = logBuffer.toSeq

  /** Consumes a specified amount of energy
   *
   * @param cost the amount of energy to consume
   * @throws IllegalArgumentException if not enough energy is available
   */
  private def payEnergy(cost: Float): Unit = {
    if (energy < cost)
      throw new IllegalArgumentException("Not enough energy!")
    energy -= cost
  }

  /** Prints all entries, that are currently in the log */
  def printLog(): Unit = {
    println("Log:")
    log.foreach(println)
  }

  /** Returns the current position of the rover as a tuple */
  def position: (Int, Int) = (x, y)
}

/** An abstract class representing an item
 *
 * @param volume the volume of the item
 */
abstract class Item(val volume: Float) {
  /** Returns the weight of the item */
  def weight: Float
}

/** Represents a fluid */
enum Material {
  case Sandstone, Granite, Sand
}

/** A class representing a rock
 *
 * @param material the material of the rock (either "sandstone", "granite", or "sand")
 * @param volume the volume of the rock
 */
class Rock(val material: Material, volume: Float) extends Item(volume) {

  /** returns the weight of the rock */
  override def weight: Float = {
    material match {
      case Material.Sandstone => volume * 2250
      case Material.Granite => volume * 2725
      case Material.Sand => volume * 1600
    }
  }

  /** Returns a texttual represention of the rock */
  override def toString = "Rock"
}

/** Represents a fluid */
enum Fluid {
  case Water, Gasoline
}

/** A class representing a container
 *
 * @param fluid the fluid in the container (either "water" or "gasoline")
 * @param volume the volume of the rock
 */
class Container(val fluid: Fluid, volume: Float) extends Item(volume) {

  /** Returns the weight of the container */
  override def weight: Float = {
    fluid match {
      case Fluid.Water => volume * 1000
      case Fluid.Gasoline => volume * 770
    }
  }

  /** returns a textual represention of the container */
  override def toString =  "Container"
}

/*
//based on EiS VL1

/** A class representing a rover
 * @param name the name of the rover
 * @param x the current x-position of the rover
 * @param y the current y-position of the rover
 * @param energy the remaining energy of the rover
 * @param weight the current total weight of the rover
 */
class Rover(val name: String,
            private var x: Int,
            private var y: Int,
            private var energy: Float,
            private var weight: Float) {
  private val items: ArrayBuffer[Item] = new ArrayBuffer()
  private val log: ArrayBuffer[String] = new ArrayBuffer()

  private val MoveEnergy: Float = 10
  private val PickupEnergy: Float = 20
  private val DropEnergy: Float = 5


  private def logged(s: String): Unit = log.append(s)

  /** Consume a specified amount of energy
   *
   * @param cost the amount of energy to consume
   * @throws IllegalArgumentException if not enough energy is available
    */

  private def payEnergy(cost: Float): Unit = {
    if (energy < cost)
      throw new IllegalArgumentException("Not enough energy!")
    energy -= cost
  }

  // Declared as "val" -> immutable -> constant
  private val MoveEnergy: Float = 10

  /** Moves the rover one step towards east */
  def moveEast(): Unit = {
    payEnergy(moveEnergy)
    x += log
  }
    /** Pickup an item from the ground
     * @param item the item to pickup
     * */
  def pickupItem(item: Item): Unit = {
    payEnergy(pickupEnergy)
    items.append(item)
    logged ("Pickup " + item)
  }

  /** Drop an item to the ground if the rover contains one
   *  @return Some(item) or None
   */


  def dropItem(): Option[Item] = {
     payEnergy(dropEnergy)

    if (!items.isEmpty) {
      val item = items.remove(0)
      logged ("Dropped " + item)
      Some (item)
    } else {
      log.append("Nothing to drop!")
      None
    }
  }
}

class Item

// Let’s create two rovers!
//object run extends App {
@main def entryPoint: Unit = {
  val rover1 = new Rover("curiosity", 0, 0, 100, 1300)
  val rover2 = new Rover("spirit", 10, 10, 100, 820)
  println(rover1)
  println(rover2)

}
*/


