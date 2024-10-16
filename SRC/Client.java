package SRC;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    static Random random = new Random();
     int playerSkill = random.nextInt(100);

    public static void main(String args[]){

        /*
         * Creating the Player arrays 1 -> 4 for 4 teams, then calling the 
         * getRandomName()' function 11 times for the 11 players on each team.
        */
        
        //Player list1 Creation
        ArrayList<Players> team1Players = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            String randomPlayerName1 = getRandomPlayerName();
            team1Players.add(new Players(1, randomPlayerName1));
        }

        //Player list2 Creation
        ArrayList<Players> team2Players = new ArrayList<>();
        for (int j = 0; j < 11; j++) {
            String randomPlayerName2 = getRandomPlayerName();
            team2Players.add(new Players(1, randomPlayerName2));
        }

        //Player list3 Creation
        ArrayList<Players> team3Players = new ArrayList<>();
        for (int k = 0; k < 11; k++) {
            String randomPlayerName3 = getRandomPlayerName();
            team3Players.add(new Players(1, randomPlayerName3));
        }

        //Player list4 Creation
        ArrayList<Players> team4Players = new ArrayList<>();
        for (int l = 0; l < 11; l++) {
            String randomPlayerName4 = getRandomPlayerName();
            team4Players.add(new Players(1, randomPlayerName4));
        }

        /*
         * Creating the Team objects 1 -> 4 for the team4Players ArrayLists 1 -> 4, 
         * then calling the getRandomTeamName()' function for each team name.
        */

        //Team1 Creation
        String randomTeamName1 = getRandomTeamName();
        Team team1 = new Team(team1Players, getRandomTeamName());

        //Team2 Creation
        String randomTeamName2 = getRandomTeamName();
        Team team2 = new Team(team2Players, getRandomTeamName());

        //Team3 Creation
        String randomTeamName3 = getRandomTeamName();
        Team team3 = new Team(team3Players, getRandomTeamName());

        //Team4 Creation
        String randomTeamName4 = getRandomTeamName();
        Team team4 = new Team(team4Players, getRandomTeamName());

        team1.display();
    }

    public static String getRandomPlayerName() {
        String[] Playernames = {"John", "Alex", "Sam", "Tom", "James", "Michael", "David", "Chris", "Daniel", "Ryan", "Nick", "Andrew", "Jason"};
        Random random = new Random();
        return Playernames[random.nextInt(Playernames.length)];
    }

    public static String getRandomTeamName() {
        String[] Teamnames = {"The Thunderbolts", "The Dragons", "The Titans", "The Mavericks", "The Wildcats", "The Sharks", "The Phoenixes", "The Warriors", "The Falcons", "The Hurricanes", "The Knights", "The Bears", "The Avengers", "The Guardians", "The Spartans", "The Outlaws"};
        Random random = new Random();
        return Teamnames[random.nextInt(Teamnames.length)];
    }
}
        