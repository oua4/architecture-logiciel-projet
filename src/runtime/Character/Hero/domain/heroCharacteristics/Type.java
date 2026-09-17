package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.TypeNameInvalidException;

public class Type{
    private final String heroType;
    private String dominantStat;

    public Type(String heroType){
        if (heroType.equalsIgnoreCase("warrior") ||
                heroType.equalsIgnoreCase("archer") ||
                heroType.equalsIgnoreCase("mage") ||
                heroType.equalsIgnoreCase("cleric")) {
            this.heroType = heroType.toLowerCase();
        } else {
            throw new TypeNameInvalidException(heroType);
        }
    }

    public void applyHeroTypeDominantStat() {
        switch (this.heroType) {
            case "warrior":
                this.dominantStat = "strength";
                break;
            case "archer":
                this.dominantStat = "dexterity";
                break;
            case "mage":
                this.dominantStat = "intelligence";
                break;
            case "cleric":
                this.dominantStat = "wisdom";
                break;
        }
    }
}