package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/Trainer.java
        train(new Duck());
         train(new Parrot());

//        Animal a2 = new Animal();
//        Bird b2 = new Bird();

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> 66b4b1ff5b34fba9a7a4558c47a82f93915f12d1:src/main/java/circus/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
<<<<<<< HEAD:src/main/java/Trainer.java
        if( bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("I am not a duck and I am not a duck");
        }

=======
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
>>>>>>> 66b4b1ff5b34fba9a7a4558c47a82f93915f12d1:src/main/java/circus/Trainer.java
    }
}
