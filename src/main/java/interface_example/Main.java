package interface_example;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.test();
        dog.test2();

        Pet pet = new Dog();
        pet.test();

        Animal animal = new Dog();
        animal.test2();

        Cat cat = new Cat();

        if (animal instanceof MarkerInterface) {
            System.out.println("Animal is Marker Interface");
        } else {
            System.out.println("Animal is not Marker Interface");
        }

        if (cat instanceof MarkerInterface) {
            System.out.println("Cat is Marker Interface");
        } else {
            System.out.println("Cat is not Marker Interface");
        }
    }
}
