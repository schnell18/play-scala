def compress(list: List[Char]): List[Char] = {
  def compress1(a: List[Char], list: List[Char]): List[Char] = {
    list match {
      case Nil => a.reverse
      case head :: tail => {
        compress1(
          if (a.isEmpty || a.head != head) head :: a else a,
          tail
        )
      }
    }
  }
  compress1(Nil, list)
}
compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
// expects List(a, b, c, a, d, e)
