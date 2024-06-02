package learnJavaQEWinter2022.RakibProblems.OOP_05.InstanceOfPracrtice;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();

        // Create an instance of Dog
        Dog dog = new Dog();

        // Test instances
        if (animal instanceof Animal) {
            System.out.println("animal is an instance of Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is an instance of Animal");
        }

        if (dog instanceof Dog) {
            System.out.println("dog is an instance of Dog");
        }
    }
}