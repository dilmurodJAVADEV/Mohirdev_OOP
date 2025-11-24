package Task8.N1;

public class FootballPlayer extends Player{
    private int coutOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String nameOfPlayer,  int numberPosition, String temaName,
                          int coutOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, "Football", numberPosition, temaName);
        this.coutOfRedCard = coutOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    @Override
    public String getInfo() {
        return "Football Player: " + getNameOfPlayer() +
                ", Goals: " + countOfGoals +
                ", Red cards: " + coutOfRedCard +
                ", Yellow cards: " + countOfYellowCard;
    }
}