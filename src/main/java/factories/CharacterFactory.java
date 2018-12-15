package factories;

import characters.Character;
import characters.*;

import java.util.Random;

public class CharacterFactory {
    private Random random = new Random();
    public Character createCharacter(){
        int type = random.nextInt(4);
        switch (type){
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new Knight(random.nextInt(10) + 2, random.nextInt(10) + 2);
            case 3: return new King(random.nextInt(10) + 5, random.nextInt(10) + 5);
        }
        return null;
    }

}
