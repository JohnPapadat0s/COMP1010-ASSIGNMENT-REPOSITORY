package SRC;

import java.util.ArrayList; 


public class Team {
    Boolean hasBeenChosen = false;
    Boolean hasWon = false;

    ArrayList<Players>teamList = new ArrayList<Players>();
    String teamName;

    public Team(ArrayList<Players> playerList, String teamName){
        this.teamList = playerList;
        this.teamName = teamName;
    }

    public void display(){
        System.out.println("Team: " + teamName);
    }
}
