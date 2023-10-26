import Animals.*;
import Food.*;

public class Zoo {
    public static void main(String[] args) {

        //Животные
        Duck duck = new Duck();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Bear bear = new Bear();
        Fish shark = new Fish();
        Elephant elephant = new Elephant();

        //Еда
        Grass osoka = new Grass();
        Meat beef = new Meat();

        //Рабочий
        Worker worker = new Worker();

        //Пруд
        Swim[] pond = new Swim[]{bear, duck, elephant, shark, horse, tiger};

        for (int i = 0; i < pond.length; i++) {
            pond[i].swim();
        }


        Run[] runnig = new Run[]{bear, duck, elephant, horse, tiger};
        for (int y = 0; y < runnig.length; y++) {
            runnig[y].run();
        }
        //Вызов методов
        worker.getVoice(bear);
//        worker.getVoice(shark);    -----> акула не может подать голос
        worker.feed(elephant, osoka);
        worker.feed(tiger, osoka);
        bear.voice();
        horse.run();
        System.out.println(tiger.voice().equals(duck.voice()));
    }
}
