package runtime.Character.Hero.domain;

import runtime.Character.Hero.application.Create.HeroCreationCommand;
import runtime.Character.Hero.domain.heroCharacteristics.Name;
import runtime.Character.Hero.domain.heroCharacteristics.Species;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;
import runtime.Character.Hero.domain.heroCharacteristics.Type;

import java.util.UUID;

public class HeroFactory {
    public Hero create(HeroCreationCommand command) {


        Name name = new Name(command.name());

        Species species = new Species(command.spiecies());

        Type type = new Type(command.type());

        Stats stats = new Stats(
                command.strenght(),
                command.dexterity(),
                command.constitution(),
                command.intelligence(),
                command.wisdom(),
                command.charisma()
        );

        return new Hero(
                UUID.randomUUID(),
                name,
                species,
                type,
                stats
        );

    }
}
