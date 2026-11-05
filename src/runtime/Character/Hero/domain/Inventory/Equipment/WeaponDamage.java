package runtime.Character.Hero.domain.Inventory.Equipment;

public class WeaponDamage {
    private final int diceCount;
    private final int facesCount;

    public WeaponDamage(int diceCount, int facesCount) {
        this.diceCount = diceCount;
        this.facesCount = facesCount;
    }
}
