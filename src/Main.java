import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

        Dog dog = new Dog("Wolf","Big",100.00);
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(new Dog("German Sheppard","big",150));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("Baracuda","big",75));
        animals.add(new Dog("Pug","small",20));

        for(Animal animal: animals){
            doAnimalStuff(animal);
        }

    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}