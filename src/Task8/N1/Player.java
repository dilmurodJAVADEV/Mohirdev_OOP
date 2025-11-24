package Task8.N1;

public abstract class Player implements Information{
    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String temaName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String temaName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.temaName = temaName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    public String getTemaName() {
        return temaName;
    }

    public void setTemaName(String temaName) {
        this.temaName = temaName;
    }

    @Override
    public String getTeamName() {
        return this.temaName;
    }
}