package Task6.B;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "quack quack";
    }
}
