package currency

case class Account(amount: Double, currency: Currency) {
  override def toString = s"$amount ${currency.code}"

  def +(that: Account) : Account = {
    Account(this.amount + that.amount * Currency.exchangeRate(that.currency)(this.currency), this.currency)
  }

  class Factor(val x: Double){
    def double2Factor(d: Double) : Factor = {
      new Factor(d * this.x)
    }
  }
}

//implicit class Factor(val x: Double) extends AnyVal {
//  def *(that: Account): Account = {
//    Account(this.x * that.amount, that.currency)
//  }
//}

