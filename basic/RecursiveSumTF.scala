object RecursiveSumTF extends App {
  def sum(list: List[Int]): Int = {
    def sum1(a: Int, list: List[Int]): Int = list match {
      case Nil => a
      case head :: tail => sum1(a + head, tail)
    }
    sum1(0, list)
  }

  val list = List.range(1, 10000)
  println(f"The sum of ${list}%s is ${sum(list)}%d")
}
