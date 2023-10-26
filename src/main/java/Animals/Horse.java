package Animals;

public class Horse extends Herbivore implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Лошадь скачет");
        satiety--;
    }

    @Override
    public void swim() {
        System.out.println("Лошадь плывёт");
        satiety--;
    }

    @Override
    public String voice() {
        System.out.println("И-и-го-го");
        return "И-и-го-го";
    }
}
