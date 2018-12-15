package characters;

public class Hobbit extends Character{
    public void kick(Character c){ this.toCry(); }

    public void toCry(){
        System.out.println("Hobbit is crying... You're a monster!");
    }

    public Hobbit(){ super(0, 3); }

}
