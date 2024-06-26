import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalDraws = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player){
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listteamMembers(){
        System.out.println(teamName + " Rosters:");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses * 2) + totalDraws + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalDraws++;
            message = "draw";
        } else{
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
