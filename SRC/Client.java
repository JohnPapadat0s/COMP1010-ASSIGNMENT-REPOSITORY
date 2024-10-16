package SRC;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    static Random random = new Random();
     int playerSkill = random.nextInt(100);

    public static void main(String args[]){
        Players Player1 = new Players(random.nextInt(100), "Team");
        Players Player2 = new Players(random.nextInt(100), "Team");
        Players Player3 = new Players(random.nextInt(100), "Team");
        Players Player4 = new Players(random.nextInt(100), "Team");

        Players Player5 = new Players(random.nextInt(100), "Team");
        Players Player6 = new Players(random.nextInt(100), "Team");
        Players Player7 = new Players(random.nextInt(100), "Team");
        Players Player8 = new Players(random.nextInt(100), "Team");
        
        Players Player9 = new Players(random.nextInt(100), "Team");
        Players Player10 = new Players(random.nextInt(100), "Team");
        Players Player11= new Players(random.nextInt(100), "Team");
        Players Player12= new Players(random.nextInt(100), "Team");
        
        Players Player13 = new Players(random.nextInt(100), "Team");
        Players Player14 = new Players(random.nextInt(100), "Team");
        Players Player15 = new Players(random.nextInt(100), "Team");
        Players Player16 = new Players(random.nextInt(100), "Team");
}
}