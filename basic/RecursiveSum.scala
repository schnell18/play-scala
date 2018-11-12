object RecursiveSum extends App {
  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  val list = List(1, 2, 3, 4)
  println(f"The sum of ${list}%s is ${sum(list)}%d")
}
