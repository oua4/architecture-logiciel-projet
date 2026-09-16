public class Type{
    private final String typeCharacter;
    private String dominantStat;

    public Type(String typeCharacter){
        if (typeCharacter.equalsIgnoreCase("warrior") ||
                typeCharacter.equalsIgnoreCase("archer") ||
                typeCharacter.equalsIgnoreCase("mage") ||
                typeCharacter.equalsIgnoreCase("cleric")) {
            this.typeCharacter = typeCharacter.toLowerCase();
        } else {
            throw new TypeNameInvalidException(typeCharacter);
        }
    }

    public void applySpeciesStats(Stats stats) {
        switch (this.typeCharacter) {
            case "warrior":
                dominantStat = "strength";
                break;
            case "archer":
                dominantStat = "dexterity";
                break;
            case "mage":
                dominantStat = "intelligence";
                break;
            case "cleric":
                dominantStat = "wisdom";
                break;
        }
    }
}