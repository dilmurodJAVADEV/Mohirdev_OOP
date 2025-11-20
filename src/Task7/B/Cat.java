package Task7.B;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says: meaw meaw");
    }

}
