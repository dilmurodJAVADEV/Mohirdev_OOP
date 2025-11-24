package Task8.N2;

public class Main {
    public static void main(String[] args) {
        BaseConverter kelvin = new KelvinConvertatsya(25);
        BaseConverter fahrenheit = new FarengeytConvertatsya(25);
        BaseConverter reaumur = new ReaumurShkalasiConvertatsya(25);

        System.out.println("Kelvin: " + kelvin.convertatsiyaQilish());
        System.out.println("Farengeyt: " + fahrenheit.convertatsiyaQilish());
        System.out.println("Reaumur: " + reaumur.convertatsiyaQilish());
    }
}
