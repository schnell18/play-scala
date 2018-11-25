package fruit.test
import fruit.Fruits
import fruit.showFruit

object PrintMenu {
    def main(args: Array[String]) = {
        for (fruit <- Fruits.menu) {
            showFruit(fruit)
        }
    }
}