package SRC;

import java.util.Random;

public class Players {
     Random random = new Random();
     int playerSkill = random.nextInt(100);
     public String playerName;

     public Players(int playerSkill, String playerName){
        this.playerSkill = playerSkill;
        this.playerName = playerName;
     }

}


