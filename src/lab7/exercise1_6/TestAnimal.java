package lab7.exercise1_6;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("cat1");
        cat1.greets();
        Dog dog1 = new Dog("dog1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigdog1");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("cat2");
        animal1.greets();
        Animal animal2 = new Dog("god2");
        animal2.greets();
        Animal animal3 = new BigDog("bigdog2");
        animal3.greets();
//        Animal animal4 = new Animal();

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal1;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}

//Meow
//Woof
//Wooow
//Meow
//Woof
//Wooow
//Wooooof
//Wooooow
//Wooooof
//Wooooow
//Woooooooooooow
