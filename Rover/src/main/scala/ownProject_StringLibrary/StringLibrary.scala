package ownProject_StringLibrary

object StringLibrary extends App{

  enum DataType {
    case String, Int
  }

  def countElements(obj: Any): Any =
    obj match
      case DataType.String => obj.toString.sum
      case DataType.Int => s"$this can't be counted."
      case _ => "Type not supported."

  println(countElements(2))



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
