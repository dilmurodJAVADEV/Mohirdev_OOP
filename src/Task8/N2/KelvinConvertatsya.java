package Task8.N2;

public class KelvinConvertatsya extends BaseConverter{
    public KelvinConvertatsya(double selsi) {
        super(selsi);
    }

    @Override
    public double convertatsiyaQilish() {
        return getSelsi() + 273.15;
    }
}
