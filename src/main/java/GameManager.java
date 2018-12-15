import characters.Character;
import java.util.ArrayList;


public class GameManager {
    public static void fight(Character c1, Character c2){
        ArrayList<Character> players = new ArrayList<>();
        players.add(c1);
        players.add(c2);

        System.out.println(String.format("A fight till death has started: %s vs %s\n", c1, c2));

        while (c1.isAlive() && c2.isAlive()){
            for (int i = 0; i < 2; i++){
                System.out.println(players.get(i).getClass().getSimpleName() +
                        " is kicking " + players.get(i^1).getClass().getSimpleName());

                players.get(i).kick(players.get(i ^ 1));

                System.out.println(String.format("Now the kicked character has %d hp and %d power\n",
                        players.get(i ^ 1).getHp(), players.get(i ^ 1).getPower()));

                if (!players.get(i ^ 1).isAlive()){
                    System.out.println(players.get(i^1).getClass().getSimpleName() + " is dead! "
                            + players.get(i).getClass().getSimpleName() + " defeated him.");
                    break;
                }
            }
        }
        System.out.println(String.format("The fight til death has ended. The winner is %s", (c1.isAlive()) ? c1: c2));
    }
}
