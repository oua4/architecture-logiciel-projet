package runtime.Character.Hero.domain.Inventory.Equipment;

public class ArmorClass {
    private final int baseValue;
    private final int bonus;

    public ArmorClass(int baseValue, int bonus) {
        this.baseValue = baseValue;
        this.bonus = bonus;
    }

    public int getValue() {
        return baseValue + bonus;
    }
}
