package Task7.B;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says: bow bow");
    }

}
