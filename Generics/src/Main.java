interface Player {}

record BaseballPlayer(String name, String position) implements Player {};

record FootballPlayer(String name, String position) implements Player {};

public class Main {
    public static void main(String[] args) {
        BaseballTeam lockers1 = new BaseballTeam("Lockers");
        BaseballTeam cespedes1 = new BaseballTeam("Cespedes");
        scoreResult(lockers1, 5, cespedes1, 3);

        BaseballTeam lockers2 = new BaseballTeam("Lockers");
        BaseballTeam cespedes2= new BaseballTeam("Cespedes");
        scoreResult(lockers2, 5, cespedes2, 3);

        Team<BaseballPlayer> lockers = new Team<>("Lockers");
        Team<BaseballPlayer> cespedes = new Team<>("Cespedes");
        scoreResult(lockers, 5, cespedes, 3);

        var arthur = new BaseballPlayer("Arthur", "Right Fielder");
        var marina = new BaseballPlayer("Marina", "Right Fielder");
        lockers1.addTeamMember(arthur);
        lockers1.addTeamMember(marina);
        lockers1.listteamMembers();

        SportsTeam afc = new SportsTeam("Adelaide Crowns");
        var tex = new FootballPlayer("Tex Walker", "Right Fielder");
        afc.addTeamMember(tex);
        afc.listteamMembers();

        var guthrie = new BaseballPlayer("Guthrie", "Right Fielder");
        afc.addTeamMember(guthrie);
        afc.listteamMembers();



    }

    public static void scoreResult(BaseballTeam team1, int  t1_score,
                                   BaseballTeam team2, int  t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int  t1_score,
                                   Team team2, int  t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}