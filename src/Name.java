import java.util.ArrayList;

public class Name{
    private String name;
    private ArrayList<String> names = new ArrayList<>();

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
                !getFirstLetter(name).equals(" ") && !getLastLetter(name).equals(" ") &&
                !names.contains(name) //Problème dans la contrainte des noms uniques
        ) {
            this.name = name;
            names.add(this.name);
        } else {
            throw new CharacterNameInvalidException(name);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}