package characters;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Character {
    int power;
    int hp;

    public boolean isAlive() { return this.hp > 0; }

    public abstract void kick(Character c);

    public String toString() {
        return String.format("%s(pow=%d, hp=%d)", this.getClass().getSimpleName(), this.power, this.hp);
    }

    Character(int power, int hp){
        this.hp = hp;
        this.power = power;
    }
}

