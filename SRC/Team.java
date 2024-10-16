package SRC;

import java.util.ArrayList;

public class Team {
    
    ArrayList<Players>teamList = new ArrayList<Players>();
    String teamName;

    public Team(ArrayList<Players> playerList, String teamName){
        this.teamList = playerList;
        this.teamName = teamName;
    }
}
