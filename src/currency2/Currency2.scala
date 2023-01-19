package currency2

import scala.language.implicitConversions

trait Currency2(val code: String){
  override def toString: String = code
}

object Euro extends Currency2("EUR")
object Dollar extends Currency2("USD")
object Yen extends Currency2("JPY")

object Currency2 {
  val locale: Euro.type = Euro

  implicit def double2Locale(d: Double) : Account2 = new Account2(d, locale)

  //noinspection DuplicatedCode
  val exchangeRate: Map[Currency2, Map[Currency2, Double]] = Map(
    Euro -> Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676),
    Dollar -> Map(Euro -> 0.863187, Dollar -> 1.0, Yen -> 113.648),
    Yen -> Map(Euro -> 0.00759441, Dollar -> 0.00879910, Yen -> 1.0))
}


