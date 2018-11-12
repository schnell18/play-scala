def exec2f(f1: (Int, Int) => Int, f2: (Int, Int) => Int, a: List[Int]): List[Tuple2[Int, Int]] = {
  a.map {a => (f1(a, a), f2(a, a))}
}
