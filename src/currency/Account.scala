package currency

import scala.annotation.targetName

case class Account(amount: Double, currency: Currency) {
  override def toString = s"$amount $currency"

  @targetName("plus")
  def +(that: Account) : Account = {
    Account(this.amount + that.amount * Currency.exchangeRate(that.currency)(this.currency), this.currency)
  }

//  def double2Factor(d: Double): Factor = {
//    Factor(d)
//  }
}
implicit class Factor(val value: Double) extends AnyVal {
  @targetName("times")
  def *(that: Account): Account = {
    Account(this.value * that.amount, that.currency)
  }
}

