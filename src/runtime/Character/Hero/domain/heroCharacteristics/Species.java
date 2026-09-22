package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.SpeciesNameInvalidException;

public class Species{
    private String heroSpecies;

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
                stats.modifyStat("strength",1);
                stats.modifyStat("dexterity", 1);
                stats.modifyStat("constitution", 1);
                stats.modifyStat("intelligence", 1);
                stats.modifyStat("wisdom", 1);
                stats.modifyStat("charisma", 1);
                break;
            case "elf":
                stats.modifyStat("dexterity", 2);
                stats.modifyStat("intelligence", 1);
                break;
            case "dwarf":
                stats.modifyStat("constitution", 2);
                stats.modifyStat("strength", 1);
                break;
            case "orc":
                stats.modifyStat("strength", 2);
                stats.modifyStat("constitution", 1);
                stats.modifyStat("intelligence", -1);
                break;
        }
    }
}