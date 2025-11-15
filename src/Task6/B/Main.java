package Task6.B;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Olapar");
        Animal duck = new Duck("Mimi");
        Animal cat = new Cat("Mosh");

        System.out.println(dog.getName() + ": " + dog.sound());
        System.out.println(duck.getName() + ": " + duck.sound());
        System.out.println(cat.getName() + ": " + cat.sound());
    }
}