package runtime.Character.Hero.domain.Inventory.Equipment;

public enum ArmorType {
    NO_ARMOR(10, true),
    LEATHER_ARMOR(11, true),
    CHAINMAIL_ARMOR(16, false);

    private final int baseValue;
    private final boolean addsDexterityModifier;

    ArmorType(int baseValue, boolean addsDexterityModifier) {
        this.baseValue = baseValue;
        this.addsDexterityModifier = addsDexterityModifier;
    }

    public ArmorClass armorClassFor(int dexterityModifier) {
        int bonus;

        if (addsDexterityModifier) {
            bonus = dexterityModifier;
        } else {
            bonus = 0;
        }
        return new ArmorClass(baseValue, bonus);
    }
}
