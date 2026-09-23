package runtime.Character.Creature.domain;
import runtime.Character.Hero.domain.Hero;
import java.util.List;

public interface CreatureBehavior {

    Hero selectTarget(List<Hero> activeHeroes);


}


