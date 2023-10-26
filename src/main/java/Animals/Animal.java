package Animals;

import Food.Food;

public abstract class Animal {
    protected int satiety = 10;

    public abstract void eat(Food food);

}
