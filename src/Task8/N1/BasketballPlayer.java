package Task8.N1;

public class BasketballPlayer extends Player{
    private int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer,  int numberPosition, String temaName, int numberOfGoals) {
        super(nameOfPlayer, "Basketball", numberPosition, temaName);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public String getInfo() {
        return "Basketball: " + getNameOfPlayer() +
                ", Goals: " + numberOfGoals;
    }
}