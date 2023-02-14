package ownProject_StringLibrary

import ownProject_StringLibrary.StringLibrary.countElements

import scala.collection.immutable.ArraySeq
import scala.collection.mutable.ArrayBuffer

object StringLibrary extends App{


  //TODO VL-Bsp hier erstmal testen, bevor weitergemacht wird.
  //imperative style:
  val numbers: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
  val squaredNumbers: ArrayBuffer[Int] = ArrayBuffer()
  var i = 0
  while (i < numbers.size) {
    squaredNumbers.append(numbers(i) * numbers(i))
    i += 1
  }
  println(squaredNumbers)

  //functional style
  val funcSquaredNumbers = squaredNumbers.map(x => x * x)
  println(funcSquaredNumbers)
  //Funktionsliteral ist vom Typ Function1[Int, Int]
  // (Int, Int) => Int
  val functionLiteral: Function1[Int, Int] = x => x * x

  //convert numbers from Int to Float
  val convertedNumbers = numbers.map((n: Int) => n.toFloat)
  println(convertedNumbers)

  //use .flatten
  val evenNumbers: ArraySeq[Int] = ArraySeq(2, 4, 6)
  val oddNumbers: ArraySeq[Int] = ArraySeq(1, 3, 5)
  val newNumbers: ArraySeq[ArraySeq[Int]] = ArraySeq(evenNumbers, oddNumbers)
  println(newNumbers)
  println (newNumbers.flatten)

  //get char seq: flatMap
  val words: ArraySeq[String] = ArraySeq("Einfuehrung", "in", "die", "Softwareentwicklung")
  val charsInWords = words.flatMap(w => w.toList)
  println(charsInWords)

  //only even numbers: filter
  val nowEvenNumbers = numbers.filter((n: Int) => n % 2 == 0)
  println(nowEvenNumbers)

  //foldLeft : Reduktion auf ein Element: Alle Elemente aufsummieren
  val EiSwords: ArraySeq[String] = ArraySeq("Einfuehrung", "in", "die", "Softwareentwicklung")
  EiSwords.foldLeft(0)((agg: Int, elem: String) => agg + elem.length)
  //it was recommended to replace .size for strings/arrays with .length

  //.reduce
  //Größtes Element erhalten
  val randomNumbers: ArraySeq[Int] = ArraySeq(96, 13, 67, 101, 42)
  val largestElem = randomNumbers.reduce((l,r) => l max r)
  //recommended to use .max

  //Summe erhalten
  val sumRandomNumbers = randomNumbers.reduce((l,r) => l + r)
  //recommended to use .sum

  //reduce wirft bei leerer Collection Fehler-> reduceOption
  val OptionLargest = randomNumbers.reduceOption((l,r) => l max r)
  val sum: Option[Int] = numbers.reduceOption((x: Int, y: Int) => x + y)

  //getOrElse
  val empty: ArraySeq[Int] = ArraySeq()
  val numbers2: ArraySeq[Int] = ArraySeq(96, 13, 67, 101, 42)

  val sum1: Option[Int] = empty.reduceOption((x: Int, y: Int) => x + y)
  println(sum1.getOrElse(0)) //Alternativwert ist Null
  val sum2: Option[Int] = numbers.reduceOption((x: Int, y: Int) => x + y)
  println(sum2.getOrElse(0))

  //.zip
  val firstNames: ArraySeq[String] = ArraySeq("Felix", "Justus")
  val lastNames: ArraySeq[String] = ArraySeq("Schuhknecht", "Henneberg")
  val zippedNames = firstNames.zip(lastNames)
  println(zippedNames)

  //Verkettung von Methoden BSP
  val wordsToChain: ArraySeq[String] = ArraySeq("Einfuehrung", "in", "die", "Softwareentwicklung")
  val res = words
    .map((s: String) => s.toList)
    .flatten
    .map((c: Char) => c.toTitleCase)

  //for loop:
  val v: ArraySeq[String] = ArraySeq("zero", "one", "three", "four")
  //immer until verwenden, das schließt auch das letzte element mit ein!
  for (i <- 0 until v.length) {
    println (v(i))
  }

  //replace 0 until v.length with v.indices recommended!!!
  for (i <- v.indices) {
    println(v(i))
  }

  //for mit Generator
  val v2: ArraySeq[String]
  = ArraySeq("zero", "one", "three", "four")
  for (entry <- v2) { //für alle entries in v2
    println(entry)
  }

  //empfohlen: .foreach
  val v3 = List(1,2,3)
  v3.foreach(println(_))

  //Mittels yield kann eine neue Collection erzeugt werden
  val v4: ArraySeq[Int] = ArraySeq(1, 2, 3, 4)
  println(v4)
  val squaredv4 = for ((x: Int) <- v4) yield x * x
  println(squaredv4)


  def countElements(obj: Any): Any =
    obj match
      case s:String => s.count
      case Int => s"$this can't be counted."
      case _ => "Type not supported."

  //println(countElements(2))
  //println(countElements("abc"))



  /**


  case class Library[A](obj: DataType) {
    def countElements(obj): Unit =
      obj match
        case DataType.String => obj.toString.sum
        case DataType.Int    => s"$this can't be counted."
        case _ => "Type not supported."
  }
   */



}
