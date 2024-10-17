package SRC;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    static Random random = new Random();
     int playerSkill = random.nextInt(100);

    public static void main(String args[]){

    //Creating the player objects

        //Player list1 Creation
        //Declaring a new ArrayList<Players> with 11 slots for each team
        ArrayList<Players> team1Players = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            //Everytime the for loop is run, String randomPlayerName1 is retrieving a new random name from getRandomPlayerName
            String randomPlayerName1 = getRandomPlayerName();
            //Everytime the for loop is run, a new player is added, with a skill and a random name that was got earilier
            int playerSkill1 = randomPlayerSkill();
            //THE RANDOM PLAYER SKILL HAS NOT BEEN MADE YET
            team1Players.add(new Players(playerSkill1, randomPlayerName1));
        }

        //THESE 3 ARE THE SAME AS THE FIRST SO IMMA NOT WRITE ALL THAT COMMENTS AGAIN 3 TIMES

        //Player list2 Creation
            ArrayList<Players> team2Players = new ArrayList<>();
            for (int j = 0; j < 11; j++) {
                String randomPlayerName2 = getRandomPlayerName();
                int playerSkill2 = randomPlayerSkill();
                team2Players.add(new Players(playerSkill2, randomPlayerName2));
            }

        //Player list3 Creation
            ArrayList<Players> team3Players = new ArrayList<>();
            for (int k = 0; k < 11; k++) {
                String randomPlayerName3 = getRandomPlayerName();
                int playerSkill3 = randomPlayerSkill();
                team3Players.add(new Players(playerSkill3, randomPlayerName3));
            }

        //Player list4 Creation
            ArrayList<Players> team4Players = new ArrayList<>();
            for (int l = 0; l < 11; l++) {
                String randomPlayerName4 = getRandomPlayerName();
                int playerSkill4 = randomPlayerSkill();
                team4Players.add(new Players(playerSkill4, randomPlayerName4));
            }

    //Creating the team objects

        //Team1 Creation, setting the String to the random name team that is retrieved from the getRandomTeamName function 
        String randomTeamName1 = getRandomTeamName();
        // Creating a new team, with the ArrayList<Players> for team 1 and then using the randomTeamName1 String for the team name
        Team team1 = new Team(team1Players, randomTeamName1);

        //THESE 3 ARE THE SAME AS THE FIRST SO IMMA NOT WRITE ALL THAT COMMENTS AGAIN 3 TIMES
        
        //Team2 Creation
            String randomTeamName2 = getRandomTeamName();
            Team team2 = new Team(team2Players, randomTeamName2);

        //Team3 Creation
            String randomTeamName3 = getRandomTeamName();
            Team team3 = new Team(team3Players, randomTeamName3);

        //Team4 Creation
            String randomTeamName4 = getRandomTeamName();
            Team team4 = new Team(team4Players, randomTeamName4);

        //Just a test to see if the team and player names were outputted randomly
        team1.display();
    }

//Code to get the random player name that is called everytime the for loop is run when declaring each new player
    public static String getRandomPlayerName() {
        //This is the list of all possible names that can be chosen from
        String[] Playernames = {
            "John", "Alberto", "Harry", "Sid", "James", "Michael", "David", "Chris", "Daniel", "Ryan", "Nick", "Andrew", "Jason", "Alex", "Matthew", 
            "Ethan", "Samuel", "Oliver", "Ben", "Liam", "Kevin", "Scott", "Adam", "Peter", "Mark", "Eric", "Lucas", "Joseph", "Anto", "Jacob", "Thomas", 
            "Jaiden", "Alessio", "Nathaniel", "Isaac", "Caleb", "Simon", "Victor", "Owen", "Julian", "Mason", "Gavin", "Charlie", "Henry", "Zachary", 
            "Dylan", "Aiden", "Max", "Tristan", "Sebastian", "Felix", "Jett", "Leo", "Nathan", "Cole", "Jason", "Isaac", "Grant", "Tyler", "Marcus", 
            "Jude", "Evan", "Blake", "Ashton", "Chase", "Wyatt", "Carter", "Riley", "Harrison", "Finn", "Miles", "Jordan", "Everett", "Kyle", "Josiah", 
            "Malcolm", "Reese", "Soren", "Nolan", "Tyson", "Archer", "Rowan", "Silas", "Quinn", "Angelo", "Tristan", "Bruno", "Kingston", "Mason", 
            "Weston", "Ryder", "Ashton", "Orion", "Zachary", "Dean", "Jorge", "Cole", "Marco", "Victor", "Damian", "Adam", "Jaxon", "Luca", "Eli", "Sawyer", 
            "Maxwell", "Gideon", "Ezra", "Zane", "Malachi", "Hugo", "Landon", "Cash", "Kaden", "Ronan", "Dante", "Apollo", "Cyrus", "Tobias", "Remy", "Dorian", 
            "Jasper", "Nico", "Finnian", "Theo", "Sullivan", "Bodhi", "Kian", "Bennett", "Tate", "Riley", "Silas", "August", "Emilio", "Wesley", "Cohen", 
            "Jettson", "Kairo", "Ryder", "Fletcher", "Reed", "Zayden", "Hendrix", "Zeke", "Kendrick", "Jovany", "Brayden", "Talon", "Dawson"
        };
         //This is just something that is nescesary, Google said idk
        Random random = new Random();
        //Here the players name is returned, it returns a random string from the Playernames array return Playernames[], 
        //and it chooses a random number between 1 and the size of the Playernames array, random.nextInt(Playernames.length)
        //Returning the string which corresponds to the number in the array
        return Playernames[random.nextInt(Playernames.length)];
    }

//Code to get the random team name that is called everytime the for loop is run when declaring each new team
    public static String getRandomTeamName() {
        //This is the list of all possible names that can be chosen from
        String[] Teamnames = {
            "The University of Sydney", "The University of Queensland", "Griffith University", "Macquarie University", "The University of Western Australia", 
            "James Cook University", "Victoria University", "The University of New South Wales", "The University of Adelaide", "The University of Tasmania", 
            "Deakin University", "The University of Melbourne", "Australian National University", "La Trobe University", "University of South Australia", 
            "Central Queensland University", "The University of Newcastle", "Southern Cross University", "Curtin University", "Charles Sturt University", 
            "Federation University Australia", "Edith Cowan University", "Western Sydney University", "Bond University", "University of the Sunshine Coast", 
            "The University of Notre Dame Australia", "Australian Catholic University", "University of Southern Queensland", "Griffith College", 
            "Torrens University Australia", "Queensland University of Technology", "RMIT University", "University of Wollongong", 
            "Melbourne Institute of Technology", "Open Universities Australia", "TAFE Queensland", "Curtin College", "Swinburne University of Technology", 
            "Australian Institute of Music", "Australian College of Applied Psychology", "Box Hill Institute", "Monash University"
        };
        //This is just something that is nescesary, Google said idk
        Random random = new Random();
        //Here the team name is returned, it returns a random string from the Teamnames array return Teamnames[], 
        //and it chooses a random number between 1 and the size of the Teamnames array, random.nextInt(Teamnames.length)
        //Returning the string which corresponds to the number in the array
        return Teamnames[random.nextInt(Teamnames.length)];
    }

    //Makes the random player skill number that is attached to each player
    public static int randomPlayerSkill(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
        