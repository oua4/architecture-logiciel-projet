public class Species{
    private final String speciesCharacter;
    private String dominantStat;

    public Species(String speciesCharacter){
        if (speciesCharacter.equalsIgnoreCase("human") ||
                speciesCharacter.equalsIgnoreCase("elf") ||
                speciesCharacter.equalsIgnoreCase("dwarf") ||
                speciesCharacter.equalsIgnoreCase("orc")) {
            this.speciesCharacter = speciesCharacter.toLowerCase();
        } else {
            throw new SpeciesNameInvalidException(speciesCharacter);
        }
    }

    public void applySpeciesStats(Stats stats) {
        switch (this.speciesCharacter) {
            case "humain":
                stats.addStrength(1);
                stats.addDexterity(1);
                stats.addConstitution(1);
                stats.addIntelligence(1);
                stats.addWisdom(1);
                stats.addCharisma(1);
                break;
            case "elf":
                stats.addDexterity(2);
                stats.addIntelligence(1);
                break;
            case "dwarf":
                stats.addConstitution(2);
                stats.addStrength(1);
                break;
            case "orc":
                stats.addStrength(2);
                stats.addConstitution(1);
                stats.subIntelligence(1);
                break;
        }
    }
}