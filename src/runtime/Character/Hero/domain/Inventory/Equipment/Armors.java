package runtime.Character.Hero.domain.Inventory.Equipment;

public class Armors {
    private String armorProtection;
    private String armorClass;

    public Armors(String protection, String armorClass){
        this.armorProtection = armorProtection;
        this.armorClass = armorClass;

        String[] armors = {"No armor", "Leather armor", "Chainmail armor"};
    }
}
