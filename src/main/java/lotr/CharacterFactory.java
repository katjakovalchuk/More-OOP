package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        Character[] characters = { new Hobbit(), new King(), new Knight(), new Elf() };
        return characters[new Random().nextInt(characters.length)];
    }
}
