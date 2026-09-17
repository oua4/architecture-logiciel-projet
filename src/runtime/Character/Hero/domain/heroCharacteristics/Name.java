package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.CharacterNameInvalidException;

public class Name{
    private String name;

    String regex = "^[a-zA-ZÀ-ÿ ]+$";

    public String getFirstLetter (String text) {
        return text.substring(0, 1);
    }

    public String getLastLetter (String text) {
        return text.substring(text.length() - 1);
    }


    public Name(String name) {

        if(
                name.length() >= 2 && name.length() <= 30 &&
                name.matches(regex) &&
                !getFirstLetter(name).equals(" ") && !getLastLetter(name).equals(" ")
        ) {
            this.name = name;
        } else {
            throw new CharacterNameInvalidException(name);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}