import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalDraws = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t){
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
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
