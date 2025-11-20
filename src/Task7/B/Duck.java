package Task7.B;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says: quack quack");
    }


}
