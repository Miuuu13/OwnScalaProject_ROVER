package ownProject_StringLibrary

import scala.collection.{ArrayOps, IterableOnceExtensionMethods, IterableOps, Searching, SeqFactory, StepperShape, StringOps}
import scala.collection.immutable.WrappedString
import scala.concurrent.duration
import scala.jdk.{DurationConverters, FunctionWrappers, FutureConverters, OptionConverters}
import scala.runtime.{RichBoolean, RichByte, RichChar, RichDouble, RichFloat, RichInt, RichLong, RichShort, Tuple2Zipped, Tuple3Zipped}
import scala.util.ChainingOps

object StringLibrary extends App{

  enum DataType {
    case String, Int
  }

  def countElements(obj: AnyVal): Any =
    obj match
      case String => obj match
        case ops: ArrayOps[_] =>
        case assoc: ArrowAssoc[_] =>
        case bool: Boolean =>
        case b: Byte =>
        case ops: ChainingOps[_] =>
        case c: Char =>
        case ops: FutureConverters.CompletionStageOps[_] =>
        case deferrer: Stream.Deferrer[_] =>
        case deferrer: LazyList.Deferrer[_] =>
        case d: Double =>
        case mult: duration.DoubleMult =>
        case double: duration.DurationDouble =>
        case int: duration.DurationInt =>
        case long: duration.DurationLong =>
        case extractor: PartialFunction.ElementWiseExtractor[_, _] =>
        case ensuring: Ensuring[_] =>
        case fl: Float =>
        case ops: FutureConverters.FutureOps[_] =>
        case i: Int =>
        case mult: duration.IntMult =>
        case methods: IterableOnceExtensionMethods[_] =>
        case ops: DurationConverters.JavaDurationOps =>
        case l: Long =>
        case mult: duration.LongMult =>
        case either: Either.MergeableEither[_] =>
        case ops: Tuple3Zipped.Ops[_, _, _] =>
        case ops: Tuple2Zipped.Ops[_, _] =>
        case partial: Range.Partial[_, _] =>
        case function: FunctionWrappers.RichBiConsumerAsFunction2[_, _] =>
        case function: FunctionWrappers.RichBiFunctionAsFunction2[_, _, _] =>
        case function: FunctionWrappers.RichBiPredicateAsFunction2[_, _] =>
        case function: FunctionWrappers.RichBinaryOperatorAsFunction2[_] =>
        case boolean: RichBoolean =>
        case function: FunctionWrappers.RichBooleanSupplierAsFunction0 =>
        case byte: RichByte =>
        case char: RichChar =>
        case function: FunctionWrappers.RichConsumerAsFunction1[_] =>
        case double: RichDouble =>
        case function: FunctionWrappers.RichDoubleBinaryOperatorAsFunction2 =>
        case function: FunctionWrappers.RichDoubleConsumerAsFunction1 =>
        case function: FunctionWrappers.RichDoubleFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichDoublePredicateAsFunction1 =>
        case function: FunctionWrappers.RichDoubleSupplierAsFunction0 =>
        case function: FunctionWrappers.RichDoubleToIntFunctionAsFunction1 =>
        case function: FunctionWrappers.RichDoubleToLongFunctionAsFunction1 =>
        case function: FunctionWrappers.RichDoubleUnaryOperatorAsFunction1 =>
        case float: RichFloat =>
        case supplier: FunctionWrappers.RichFunction0AsBooleanSupplier =>
        case supplier: FunctionWrappers.RichFunction0AsDoubleSupplier =>
        case supplier: FunctionWrappers.RichFunction0AsIntSupplier =>
        case supplier: FunctionWrappers.RichFunction0AsLongSupplier =>
        case supplier: FunctionWrappers.RichFunction0AsSupplier[_] =>
        case consumer: FunctionWrappers.RichFunction1AsConsumer[_] =>
        case consumer: FunctionWrappers.RichFunction1AsDoubleConsumer =>
        case function: FunctionWrappers.RichFunction1AsDoubleFunction[_] =>
        case predicate: FunctionWrappers.RichFunction1AsDoublePredicate =>
        case function: FunctionWrappers.RichFunction1AsDoubleToIntFunction =>
        case function: FunctionWrappers.RichFunction1AsDoubleToLongFunction =>
        case operator: FunctionWrappers.RichFunction1AsDoubleUnaryOperator =>
        case function: FunctionWrappers.RichFunction1AsFunction[_, _] =>
        case consumer: FunctionWrappers.RichFunction1AsIntConsumer =>
        case function: FunctionWrappers.RichFunction1AsIntFunction[_] =>
        case predicate: FunctionWrappers.RichFunction1AsIntPredicate =>
        case function: FunctionWrappers.RichFunction1AsIntToDoubleFunction =>
        case function: FunctionWrappers.RichFunction1AsIntToLongFunction =>
        case operator: FunctionWrappers.RichFunction1AsIntUnaryOperator =>
        case consumer: FunctionWrappers.RichFunction1AsLongConsumer =>
        case function: FunctionWrappers.RichFunction1AsLongFunction[_] =>
        case predicate: FunctionWrappers.RichFunction1AsLongPredicate =>
        case function: FunctionWrappers.RichFunction1AsLongToDoubleFunction =>
        case function: FunctionWrappers.RichFunction1AsLongToIntFunction =>
        case operator: FunctionWrappers.RichFunction1AsLongUnaryOperator =>
        case predicate: FunctionWrappers.RichFunction1AsPredicate[_] =>
        case function: FunctionWrappers.RichFunction1AsToDoubleFunction[_] =>
        case function: FunctionWrappers.RichFunction1AsToIntFunction[_] =>
        case function: FunctionWrappers.RichFunction1AsToLongFunction[_] =>
        case operator: FunctionWrappers.RichFunction1AsUnaryOperator[_] =>
        case consumer: FunctionWrappers.RichFunction2AsBiConsumer[_, _] =>
        case function: FunctionWrappers.RichFunction2AsBiFunction[_, _, _] =>
        case predicate: FunctionWrappers.RichFunction2AsBiPredicate[_, _] =>
        case operator: FunctionWrappers.RichFunction2AsBinaryOperator[_] =>
        case operator: FunctionWrappers.RichFunction2AsDoubleBinaryOperator =>
        case operator: FunctionWrappers.RichFunction2AsIntBinaryOperator =>
        case operator: FunctionWrappers.RichFunction2AsLongBinaryOperator =>
        case consumer: FunctionWrappers.RichFunction2AsObjDoubleConsumer[_] =>
        case consumer: FunctionWrappers.RichFunction2AsObjIntConsumer[_] =>
        case consumer: FunctionWrappers.RichFunction2AsObjLongConsumer[_] =>
        case function: FunctionWrappers.RichFunction2AsToDoubleBiFunction[_, _] =>
        case function: FunctionWrappers.RichFunction2AsToIntBiFunction[_, _] =>
        case function: FunctionWrappers.RichFunction2AsToLongBiFunction[_, _] =>
        case function: FunctionWrappers.RichFunctionAsFunction1[_, _] =>
        case int: RichInt =>
        case function: FunctionWrappers.RichIntBinaryOperatorAsFunction2 =>
        case function: FunctionWrappers.RichIntConsumerAsFunction1 =>
        case function: FunctionWrappers.RichIntFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichIntPredicateAsFunction1 =>
        case function: FunctionWrappers.RichIntSupplierAsFunction0 =>
        case function: FunctionWrappers.RichIntToDoubleFunctionAsFunction1 =>
        case function: FunctionWrappers.RichIntToLongFunctionAsFunction1 =>
        case function: FunctionWrappers.RichIntUnaryOperatorAsFunction1 =>
        case long: RichLong =>
        case function: FunctionWrappers.RichLongBinaryOperatorAsFunction2 =>
        case function: FunctionWrappers.RichLongConsumerAsFunction1 =>
        case function: FunctionWrappers.RichLongFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichLongPredicateAsFunction1 =>
        case function: FunctionWrappers.RichLongSupplierAsFunction0 =>
        case function: FunctionWrappers.RichLongToDoubleFunctionAsFunction1 =>
        case function: FunctionWrappers.RichLongToIntFunctionAsFunction1 =>
        case function: FunctionWrappers.RichLongUnaryOperatorAsFunction1 =>
        case function: FunctionWrappers.RichObjDoubleConsumerAsFunction2[_] =>
        case function: FunctionWrappers.RichObjIntConsumerAsFunction2[_] =>
        case function: FunctionWrappers.RichObjLongConsumerAsFunction2[_] =>
        case option: OptionConverters.RichOption[_] =>
        case optional: OptionConverters.RichOptional[_] =>
        case double: OptionConverters.RichOptionalDouble =>
        case int: OptionConverters.RichOptionalInt =>
        case long: OptionConverters.RichOptionalLong =>
        case function: FunctionWrappers.RichPredicateAsFunction1[_] =>
        case short: RichShort =>
        case function: FunctionWrappers.RichSupplierAsFunction0[_] =>
        case function: FunctionWrappers.RichToDoubleBiFunctionAsFunction2[_, _] =>
        case function: FunctionWrappers.RichToDoubleFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichToIntBiFunctionAsFunction2[_, _] =>
        case function: FunctionWrappers.RichToIntFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichToLongBiFunctionAsFunction2[_, _] =>
        case function: FunctionWrappers.RichToLongFunctionAsFunction1[_] =>
        case function: FunctionWrappers.RichUnaryOperatorAsFunction1[_] =>
        case ops: DurationConverters.ScalaDurationOps =>
        case impl: Searching.SearchImpl[_, _] =>
        case shape: StepperShape.Shape =>
        case sh: Short =>
        case ops: IterableOps.SizeCompareOps =>
        case format: StringFormat[_] =>
        case ops: StringOps =>
        case zipped: Tuple2Zipped[_, _, _, _] =>
        case zipped: Tuple3Zipped[_, _, _, _, _, _] =>
        case wrapper: SeqFactory.UnapplySeqWrapper[_] =>
        case wrapper: Array.UnapplySeqWrapper[_] =>
        case unit: Unit =>
        case ops: Function1.UnliftOps[_, _] =>
        case op: WrappedString.UnwrapOp =>
        case of: ValueOf[_] =>
        case any2stringadd: any2stringadd[_] =>
        case _ =>

      case Int => s"$this can't be counted."
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
