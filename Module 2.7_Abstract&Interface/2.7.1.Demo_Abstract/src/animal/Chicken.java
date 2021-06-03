package animal;

import animal.Animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "animal.Chicken : Ò Ó O Ò !!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
