package SRC;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main(String args[]){
        Player player1 = new Player("Sid", "Homosexual", 19);
        Player.displayPlayerInfo(player1);

        List<Player> team1 = new ArrayList<Player>();
        team1.add(player1);
        Team Macquarie = new Team("Macquarie", team1 ,"Macquarie Uni");
    }
}
