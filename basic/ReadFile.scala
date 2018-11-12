import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  val maxWidth = widthOfLength(lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  ))
  for (line <- lines) {
     val padding = " " * (maxWidth - widthOfLength(line))
     println(padding + line.length + " | " + line)
  }
}
else {
  Console.err.println("Please enter filename")
}
