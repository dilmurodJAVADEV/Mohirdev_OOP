package Task8.N1;

public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, int numberPosition, String temaName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, numberPosition, temaName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    @Override
    public String getInfo() {
        return "Setter: " + getNameOfPlayer() +
                ", Sets: " + countOfSets;
    }
}