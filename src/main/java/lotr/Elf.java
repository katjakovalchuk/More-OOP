package lotr;

import lombok.Getter;

@Getter
public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character opponent) {
        if (getPower() > opponent.getPower()) {
            opponent.setHp(0);
        } else if (getPower() <= opponent.getPower()) {
            opponent.setHp(opponent.getHp() - 1);
        }
    }

    @Override
    public String name() {
        return "Elf";
    }
}
