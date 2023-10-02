package lotr;

public class King extends Noble {
    public King() {
        super(5, 15);

    }

    @Override
    public void kick(Character opponent) {
        super.kick(opponent);
    }

    @Override
    public String name() {
        return "King";
    }
}
