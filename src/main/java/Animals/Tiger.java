package Animals;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    @Override
    public void run() {
        System.out.println("Тигр бежит");
        satiety--;
    }

    @Override
    public void swim() {
        System.out.println("Тигр плавает");
        satiety--;
    }

    @Override
    public String voice() {
        System.out.println("Рычит р-р-р");
        return "Рычит р-р-р";
    }
}
