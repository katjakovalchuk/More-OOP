package lotr;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character opponent);

    public String name() {
        return "Character";
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = 0;
        }
        this.hp = hp;
    }
}
