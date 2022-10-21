package test
import currency._
import currency.Currency._



object Test extends App {
  println(Euro)

//  println(Currency.exchangeRate(Euro, Dollar))
//  println(Currency.exchangeRate(Dollar, Euro))

  println(Currency.exchangeRate(Euro)(Dollar))
  println(Currency.exchangeRate(Dollar)(Euro))

  val a1 = Account(10, Euro)
  println("a1: " + a1)

  val a2 = Account(10, Dollar) + a1
  println("a2: " + a2)

  val a3: Account = Currency.double2Locale(22.50)
  println("a3: " + a3)

  val a4: Account = 22.50
  println("a4: " + a4)

  val res1 = a4 + 12.5
  println("res1: " + res1)

  val res2 = 12.5 + a4
  println("res2: " + res2)

  val a5 = 0.1 * a4
  println(a5)

}
