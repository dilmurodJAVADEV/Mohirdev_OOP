package Task8.N1;

public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(String nameOfPlayer, int numberPosition, String temaName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, numberPosition, temaName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    @Override
    public String getInfo() {
        return "Basketball Player: " + getNameOfPlayer() +
                ", Guard: " + countOfGuard;
    }
}
