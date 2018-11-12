object RecursiveSum extends App {
  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  val list = List.range(1, 10000)
  println(f"The sum of ${list}%s is ${sum(list)}%d")
}
