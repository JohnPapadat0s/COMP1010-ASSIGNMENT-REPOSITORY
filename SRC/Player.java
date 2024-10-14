package SRC;

public class Player {
    public static String name;
    public static String position;
    public static int age;
    
    public Player(String name, String position, int age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public static void getStats(Player player){
        System.out.println(player.name);
        System.out.println(player.position);
        System.out.println(player.age);
    }
}
