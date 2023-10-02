package lotr;

public class GameManager {
    public static void fight(Character character1, Character character2) {
        if (character1 instanceof Hobbit && character2 instanceof Hobbit) {
            System.out.println("The characters are the type Hobbit and they decided to drink tea.");
            return;
        }
        System.out.println("Today we looking on a fight of " + character1);
        System.out.println("Today we looking on a fight of " + character2);
        while (character1.isAlive() && character2.isAlive()) {

            character1.kick(character2);
            character2.kick(character1);

            System.out.println(
                    "Character " + character1 + " delt " + character1.getPower()
                            + "to character " + character2);
            System.out.println(
                    "Character " + character2 + " delt " + character2.getPower()
                            + "to character " + character1);

            character1.setHp(character1.getHp());
            character2.setHp(character2.getHp());
        }

        if (character1.isAlive()) {
            System.out.println("Character " + character1 + " won!!!");
        } else if (character2.isAlive()) {
            System.out.println("Character " + character2 + " won!!!");
        } else {
            System.out.println("Characters thought about their behaviour and became friends for ages.");
        }
    }

    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        fight(character1, character2);
    }
}
