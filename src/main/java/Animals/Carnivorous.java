package Animals;

import Food.*;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            satiety++;
            System.out.println("Хищник покушал. Сытость хищника " + satiety);
        } else System.out.println("Хищник не кушает такую еду");
    }
}
