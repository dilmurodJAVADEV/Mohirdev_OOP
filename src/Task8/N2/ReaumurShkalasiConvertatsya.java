package Task8.N2;

public class ReaumurShkalasiConvertatsya extends BaseConverter{
    public ReaumurShkalasiConvertatsya(double selsi) {
        super(selsi);
    }

    @Override
    public double convertatsiyaQilish() {
        return getSelsi() * 0.8;
    }
}
