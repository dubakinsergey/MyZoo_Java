package Animals;

public class Elephant extends Herbivore implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Слон бежит");
        satiety--;
    }

    @Override
    public void swim() {
        System.out.println("Слон плывёт");
        satiety--;
    }

    @Override
    public String voice() {
        System.out.println("Слон призывно трубит подняв хобот");
        return "Слон призывно трубит подняв хобот";
    }
}
