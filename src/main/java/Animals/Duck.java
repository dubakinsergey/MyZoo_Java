package Animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    @Override
    public void fly() {
        System.out.println("Утка летит");
        satiety--;
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
        satiety--;
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
        satiety--;
    }

    @Override
    public String voice() {
        System.out.println("Кря-кря");
        return "Кря-кря";
    }
}
