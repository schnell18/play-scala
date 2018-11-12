object m1 {
  def main(args: Array[String]) {
    val firstArg = if (!args.isEmpty) args(0) else ""

    val friend =
      firstArg match {
        case "salt"  => "pepper"
        case "chips" => "salsa"
        case "eggs"  => "bacon"
        case _       => "huh?"
      }

    println(friend)
  }
}
