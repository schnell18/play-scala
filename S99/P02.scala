def penultimate(list: List[Int]): Int = list.takeRight(2).head
penultimate(List(1, 1, 2, 3, 5, 8))

scala> def nth(list: List[Int]): Int = {

