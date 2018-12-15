package characters;

public class Elf extends Character{
    public void kick(Character c){
        if (c.power < this.power) c.hp = 0;
        else c.power --;
    }

    public Elf(){super(10, 10); }

}
