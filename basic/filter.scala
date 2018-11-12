def filter[A](p: (A) => Boolean, list: Seq[A]): Seq[A] = {
  for {
    x <- list
    if p(x) == true
  } yield x
}
