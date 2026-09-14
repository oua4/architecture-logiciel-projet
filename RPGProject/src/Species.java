import java.util.ArrayList;

public class Species{
    private ArrayList<String> species = new ArrayList<>();
    private String human = "Human";
    private String elf = "Elf";
    private String dwarf = "dwarf";
    private String orc = "orc";
    private String dominantStat;

    public Species(String speciesCharacter){
        if (speciesCharacter.equals(human)) {
            this.human = speciesCharacter;
        } else if (speciesCharacter.equals(elf)) {
            this.elf = speciesCharacter;
        } else if (speciesCharacter.equals(dwarf)) {
            this.dwarf = speciesCharacter;
        } else if (speciesCharacter.equals(orc)) {
            this.orc = speciesCharacter;
        }
    }

}