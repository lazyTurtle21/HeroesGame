package characters;

import java.util.Random;

public class SwordsMan extends Character {
    private Random random = new Random();

    public void kick(Character c){ c.hp -= this.random.nextInt(this.power); }

    public SwordsMan(int hp, int power){ super(power, hp); }

}
