package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0);
    }

    private void toCry() {
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }

    @Override
    public void kick(Character opponent) {
        toCry();
    }

    @Override
    public String name() {
        return "Hobbit";
    }
}
