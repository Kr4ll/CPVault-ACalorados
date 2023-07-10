object Parity {

  def findOutlier(integers: List[Int]): Int = {
    val (findEven, findOdd) = integers.partition(_ % 2 == 0)
    if (findEven.length == 1) findEven.head else findOdd.head
  }
}
