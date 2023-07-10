object SumOfDigits {

  def digitalRoot(n: Int): Int =
    if (n < 10) n else digitalRoot(n.toString.toCharArray.map(_.asDigit).sum)
}
