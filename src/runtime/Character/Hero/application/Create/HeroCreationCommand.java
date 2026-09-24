package runtime.Character.Hero.application.Create;

public record HeroCreationCommand(
        String name,
        String spiecies,
        String type,
        int strenght,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma) {

}
