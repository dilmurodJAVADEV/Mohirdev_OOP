package Task4.Sxema_B;

public class Sounds extends Electronics{
    private int chastotalarOraligi;

    public Sounds(String brend, String model, int quvvati, int chastotalarOraligi) {
        super(brend, model, quvvati);
        this.chastotalarOraligi = chastotalarOraligi;
    }

    public int getChastotalarOraligi() {
        return chastotalarOraligi;
    }

    public void setChastotalarOraligi(int chastotalarOraligi) {
        this.chastotalarOraligi = chastotalarOraligi;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Chastatolar oraligi: " + chastotalarOraligi);
    }
}
