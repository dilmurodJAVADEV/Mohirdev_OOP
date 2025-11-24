package Task8.N1;

public class Main {
    public static void main(String[] args) {
        Player goalKeeper = new GoalKeeper("Dilmurod", 07, "Cheldr",1,5,3,532);
        Player setter = new VolleyballPlayer("Azamat",1,"UrSU",65);
        Player poinGuard = new BasketballPlayer("Behruz",6,"Xorazm",258);
        Player footballPlayer = new FootballPlayer("Ravshan", 10, "Uzbekiston",0,3,43);

        System.out.println(goalKeeper.getInfo());
        System.out.println();
        System.out.println(setter.getInfo());
        System.out.println();
        System.out.println(poinGuard.getInfo());
        System.out.println();
        System.out.println(footballPlayer.getInfo());
    }
}
