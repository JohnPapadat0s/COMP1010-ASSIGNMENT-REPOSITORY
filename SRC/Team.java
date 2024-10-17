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

    //This is called in client i was testing the teams random name thigo
    public void display(){
        //Just outputs the team name 
        System.out.println("Team: " + teamName);
        //Runs through the size of the teamList (All the players names that are also randomised)
        for(int i = 0; i < teamList.size(); i++){
            //Outputs the individual players names from the list
            System.out.println(teamList.get(i).getName());
        }
    }
}
