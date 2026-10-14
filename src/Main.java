import runtime.Character.Hero.domain.Inventory.Equipment.ArmorType;

public class Main{
  public static void main(String[] args){
    System.out.println(ArmorType.LEATHER_ARMOR.armorClassFor(2).getValue());    // 13
    System.out.println(ArmorType.CHAINMAIL_ARMOR.armorClassFor(2).getValue());  // 16
  }
}