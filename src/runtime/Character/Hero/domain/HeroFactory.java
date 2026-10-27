package runtime.Character.Hero.domain;

import runtime.Character.Hero.domain.heroCharacteristics.Name;
import runtime.Character.Hero.domain.heroCharacteristics.Species;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;

import java.util.UUID;

public class HeroFactory {

    public Hero create(String heroName, String heroType, String heroSpecies, Stats stats) {
        Name name = new Name(heroName);
        Type type = new Type(heroType);
        Species species = new Species(heroSpecies);

        species.applySpeciesStats(stats);

        return new Hero(UUID.randomUUID(), name, species, type, stats);
    }
}