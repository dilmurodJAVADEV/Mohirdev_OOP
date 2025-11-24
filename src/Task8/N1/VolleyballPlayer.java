package Task8.N1;

public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, int numberPosition, String temaName, int numberOfPoints) {
        super(nameOfPlayer, "Volleyball", numberPosition, temaName);
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public String getInfo() {
        return "Voleyball: " + getNameOfPlayer() +
                ", Points: " + numberOfPoints;
    }
}