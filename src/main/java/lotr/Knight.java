package lotr;

public class Knight extends Noble {
    public Knight() {
        super(2, 12);
    }

    @Override
    public void kick(Character opponent) {
        super.kick(opponent);
    }

    @Override
    public String name() {
        return "Knight";
    }
}
