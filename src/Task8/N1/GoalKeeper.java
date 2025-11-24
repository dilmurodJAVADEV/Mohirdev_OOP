package Task8.N1;

public class GoalKeeper extends FootballPlayer{
    private int countOfSaves;

    public GoalKeeper(String nameOfPlayer, int numberPosition, String temaName,
                      int coutOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, numberPosition, temaName, coutOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    @Override
    public String getInfo() {
        return "GoalKeeper: " + getNameOfPlayer() +
                ", Save: " + countOfSaves;
    }
}