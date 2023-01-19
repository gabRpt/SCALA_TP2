package currency2

import scala.annotation.targetName

case class Account2(amount: Double, currency: Currency2) {
  override def toString = s"$amount ${currency.code}"

  @targetName("plus")
  def +(that: Account2): Account2 = {
    Account2(this.amount + that.amount * Currency2.exchangeRate(that.currency)(this.currency), this.currency)
  }
}

object Account2 {
  extension (a: Account2) @targetName("plus")
  def +(b: Account2): Account2 = {
    require(a.currency == b.currency)
    Account2(a.amount + b.amount, a.currency)
  }
  extension (a: Double) @targetName("times")
  def *(b: Account2): Account2 = Account2(a * b.amount, b.currency)
}