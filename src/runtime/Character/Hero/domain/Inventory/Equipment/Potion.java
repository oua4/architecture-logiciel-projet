package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.points.LifePoints;

public class Potion {
    public void takePotion(LifePoints lifePoints) {
        lifePoints.heal(); //Ça fait pas beaucoup de sens mais bon
    }
}