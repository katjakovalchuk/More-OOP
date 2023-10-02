package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    private static Random random = new Random();

    public Noble(int min, int max) {
        super(random.nextInt(max - min) + min + 1, random.nextInt(max - min) + min + 1);
    }

    @Override
    public void kick(Character opponent) {
        opponent.setHp(opponent.getHp() - random.nextInt(getPower()));
    }
}
