import runtime.Character.Hero.domain.Hero;
import runtime.Character.Hero.domain.HeroFactory;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;

public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();

        Stats stats = new Stats(18, 18, 14, 10, 8, 13);

        Hero hero = factory.create("Arthur", "warrior", "orc", stats);

        System.out.println("Force : " + stats.getStrength());
        System.out.println("Dextérité : " + stats.getDexterity());
        System.out.println("PM : " + hero.getCurrentMp());
    }
}