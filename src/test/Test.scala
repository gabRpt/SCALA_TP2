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
  assert(a1.amount == 10)

  val a2 = Account(10, Dollar) + a1
  println("a2: " + a2)
  assert(a2.amount == 21.585)

  val a3: Account = Currency.double2Locale(22.50)
  println("a3: " + a3)
  assert(a3.amount == 22.50)

  val a4: Account = 22.50
  println("a4: " + a4)
  assert(a4.amount == 22.50)

  val res1 = a4 + 12.5
  println("res1: " + res1)
  assert(res1.amount == 35.0)

  val res2 = 12.5 + a4
  println("res2: " + res2)
  assert(res2.amount == 35.0)

  val a5 = 0.1 * a4
  println(a5)
  assert(a5.amount == 2.25)

}
