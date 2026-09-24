package runtime.Character.Hero.domain.Inventory.Equipment;

import runtime.Character.Hero.domain.points.LifePoints;

public class Potion {
    private int healAmount; // résultat des dés + 2
    private int healDifference = maxLifePoints - currentLifePoints;

    public boolean isExcessHealing() {
        return healAmount >= healDifference;
    }

    public void heal(){
        
        if(!isExcessHealing()){
            currentLifePoints += healAmount;
        }

    }
}