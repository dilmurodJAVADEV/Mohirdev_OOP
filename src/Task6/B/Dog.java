package Task6.B;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "bow bow";
    }
}