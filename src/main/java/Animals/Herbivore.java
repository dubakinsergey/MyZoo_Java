package Animals;

import Food.*;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            satiety++;
            System.out.println("Травоядное покушало. Сытость животного: " + satiety);
        } else
            System.out.println("Травоядное не кушает такую еду ");
    }
}
