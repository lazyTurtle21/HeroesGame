import characters.Character;
import factories.CharacterFactory;

public class Main {
    public static void main(String[] args){
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        GameManager.fight(c1, c2);

    }
}
