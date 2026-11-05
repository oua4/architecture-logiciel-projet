package runtime.Character.Hero.domain.Inventory.Equipment;

public enum WeaponType {
    LONG_SWORD(new WeaponDamage(1, 8)),
    AXE(new WeaponDamage(1, 10)),
    MACE(new WeaponDamage(1, 6)),
    DAGGER(new WeaponDamage(1, 4)),
    BOW(new WeaponDamage(1, 8)),
    STICK(new WeaponDamage(1, 6));

    private final WeaponDamage damage;

    WeaponType(WeaponDamage damage) {
        this.damage = damage;
    }
}
