package SRC;

import java.util.Random;

public class Players {
     Random random = new Random();
     int playerSkill = random.nextInt(100);
     public int rating;
     public String playerName;

     public Players(int rating, String playerName){
        this.rating = rating;
        this.playerName = playerName;

     }

}


