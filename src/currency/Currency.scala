package currency

import scala.language.implicitConversions

trait Currency(val code: String){
  override def toString: String = code
}

object Euro extends Currency("EUR")
object Dollar extends Currency("USD")
object Yen extends Currency("JPY")

object Currency {
  val locale: Euro.type = Euro

  implicit def double2Locale(d: Double) : Account = Account(d, locale)

  //noinspection DuplicatedCode
  // ============= SOLUTIONS POUR exchangeRate(Currency)(Currency) =============
  val exchangeRate: Map[Currency, Map[Currency, Double]] = Map(
    Euro -> Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676),
    Dollar -> Map(Euro -> 0.863187, Dollar -> 1.0, Yen -> 113.648),
    Yen -> Map(Euro -> 0.00759441, Dollar -> 0.00879910, Yen -> 1.0))

//  val currenciesValueOnEuro = Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676)
//  def exchangeRate(currencies: (Currency, Currency)): Double = {
//    val (from, to) = currencies
//    currenciesValueOnEuro(to) / currenciesValueOnEuro(from)
//  }

//  def exchangeRate(from: Currency)(to: Currency): Double = {
//    val currenciesValueOnEuro = Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676)
//    currenciesValueOnEuro(to) / currenciesValueOnEuro(from)
//  }
  // ============================================================================
}


