package SRC;

public class Player {
    public String name;
    public String position;
    public int age;
    
    public Player(String name, String position, int age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public static void displayPlayerInfo(Player player){
        System.out.println(player.name);
        System.out.println(player.position);
        System.out.println(player.age);
    }

}
