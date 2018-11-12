def fibonacci(n: BigInt): BigInt = {
  import scala.annotation.tailrec
  @tailrec
  def fib(i: BigInt, j: BigInt, k: BigInt): BigInt = {
    if (i == n) j + k
    else fib(i + 1, k, j + k)
  }

  if (n == 1 || n == 2) 1
  else fib(3, 1, 1)
}

println(fibonacci(100))

