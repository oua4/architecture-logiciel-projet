public class Stats{
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    int[] stats = {strength, dexterity, constitution, intelligence, wisdom, charisma};

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        for(int stat : stats) {
            if (
                    stat <= 20 && stat >= 0
            ) {
                this.strength = strength;
                this.dexterity = dexterity;
                this.constitution = constitution;
                this.intelligence = intelligence;
                this.wisdom = wisdom;
                this.charisma = charisma;
            }
        }

    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }
}