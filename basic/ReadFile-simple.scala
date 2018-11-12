import scala.io.Source

if (args.length > 0) {
  for (line <- Source.fromFile(args(0)).getLines())
   println(f"${line.length}%02d | $line")
}
else {
  Console.err.println("Please enter filename")
}
