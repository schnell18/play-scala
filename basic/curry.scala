class Currying {
  def f1(a: Int, b: Int) = { a + b }
  def f2(a: Int)(b: Int) = { a + b }
}
