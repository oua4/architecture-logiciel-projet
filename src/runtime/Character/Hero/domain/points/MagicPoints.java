package runtime.Character.Hero.domain.points;

import runtime.Character.Hero.domain.heroCharacteristics.Type;

public class MagicPoints {
    private int currentMagicPoints;
    private int maxMagicPoints;

    public MagicPoints(Type type) {
        this.maxMagicPoints = type.getBaseMagicPoints();
        this.currentMagicPoints = this.maxMagicPoints;
    }

    //Il faut lancer les sorts pour continuer
}
