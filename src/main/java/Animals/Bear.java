package Animals;

public class Bear extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Медведь бежит");
        satiety--;
    }

    @Override
    public void swim() {
        System.out.println("Медведь плывёт");
        satiety--;
    }

    @Override
    public String voice() {
        System.out.println("Ревёт у-у-у-ю");
        return "Ревёт у-у-у-ю";
    }
}
