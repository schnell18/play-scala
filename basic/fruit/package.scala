package object fruit {
    def showFruit(fruit: Fruit) = {
        import fruit._
        println(f"${name}s are $color")
    }
}