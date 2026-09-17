package runtime.Character.Hero.domain.heroCharacteristics;

import runtime.Character.Hero.domain.exceptions.StatNumberInvalidException;

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
                break;
            } else {
                throw new StatNumberInvalidException();
            }
        }

    }

    public int getStrength() {
        return strength;
    }

    public int addStrength(int number) {
        return strength += number;
    }

    public int subStrength(int number) {
        return strength -= number;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int addDexterity(int number) {
        return dexterity += number;
    }

    public int subDexterity(int number) {
        return dexterity -= number;
    }

    public int getConstitution() {
        return constitution;
    }

    public int addConstitution(int number) {
        return constitution += number;
    }

    public int subConstitution(int number) {
        return constitution -= number;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int addIntelligence(int number) {
        return intelligence += number;
    }

    public int subIntelligence(int number) {
        return intelligence -= number;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int addWisdom(int number) {
        return wisdom += number;
    }

    public int subWisdom(int number) {
        return wisdom -= number;
    }

    public int getCharisma() {
        return charisma;
    }

    public int addCharisma(int number) {
        return charisma += number;
    }

    public int subCharisma(int number) {
        return charisma -= number;
    }

    public int getModifier(int stat) {
        int modifier = (stat - 10) / 2;
        return (int) Math.floor(modifier);
    }
}