package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Parrot());
        //Animal a2 = new Animal();
        //Bird b2 = new Bird();
=======
        // train(new Parrot());
>>>>>>> origin/improved:src/main/java/Trainer.java
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
<<<<<<< HEAD:src/main/java/circus/Trainer.java

=======
>>>>>>> origin/improved:src/main/java/Trainer.java
    }
}
