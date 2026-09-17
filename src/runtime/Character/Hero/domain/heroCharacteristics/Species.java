package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.SpeciesNameInvalidException;

public class Species{
    private final String heroSpecies;

    public Species(String heroSpecies){
        if (heroSpecies.equalsIgnoreCase("human") ||
                heroSpecies.equalsIgnoreCase("elf") ||
                heroSpecies.equalsIgnoreCase("dwarf") ||
                heroSpecies.equalsIgnoreCase("orc")) {
            this.heroSpecies = heroSpecies.toLowerCase();
        } else {
            throw new SpeciesNameInvalidException(heroSpecies);
        }
    }

    public void applySpeciesStats(Stats stats) {
        switch (this.heroSpecies) {
            case "human":
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