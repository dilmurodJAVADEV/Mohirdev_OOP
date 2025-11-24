package Task8.N2;

public class FarengeytConvertatsya extends BaseConverter {

    public FarengeytConvertatsya(double selsi) {
        super(selsi);
    }

    @Override
    public double convertatsiyaQilish() {
        return (getSelsi() * 9/5) + 32;
    }
}
