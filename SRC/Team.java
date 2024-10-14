package SRC;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String teamName;
    public List<Player> listOfPlayers = new ArrayList<>();
    public String homeStadium;

    public Team(String teamName, List<Player> listOfPlayers, String homeStadium){
        this.teamName = teamName;
        this.listOfPlayers = listOfPlayers;
        this.homeStadium = homeStadium;
    }

}
