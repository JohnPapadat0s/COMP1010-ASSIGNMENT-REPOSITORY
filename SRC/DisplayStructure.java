package SRC;

import java.util.ArrayList;

public class DisplayStructure {
    static int teamSkillAVG = 0;

    //This is called in client i was testing the teams random name thigo it outputs a team and its players
    public static void displayAll(Team team1){
        String teamName = team1.teamName;
        ArrayList<Players>teamList = team1.teamList;
        
        for(int i = 0; i < teamList.size(); i++){
            //Sum / 11 of each players' skill 
            teamSkillAVG += teamList.get(i).getSkill();
        }
        teamSkillAVG /= 11;
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(" ");
        //Just outputs the team name 
        System.out.println("Team Rating:   " + teamSkillAVG + ": " + teamName);
        System.out.println(" ");
        //Runs through the size of the teamList (All the players names that are also randomised)
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(int i = 0; i < teamList.size(); i++){
            //Outputs the individual players names from the list
            System.out.println("Player Rating: " + teamList.get(i).getSkill() + ": " + teamList.get(i).getName());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            
        }
        System.out.println(" ");
    }
}
