package ie.atu.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Character> combatants;

    public Game() {
        this.combatants = new ArrayList<>();
    }
    public void addCombatant(Character character) {
        combatants.add(character);
    }
    public void startBattle() {
        System.out.println("The battle begins!");
        for (Character attacker : combatants) {
            for (Character defender : combatants) {
                if (attacker != defender) {
                    if (attacker instanceof Fighter) {
                        ((Fighter) attacker).attack(defender);
                    } else if (attacker instanceof Wizard) {
                        ((Wizard) attacker).castSpell("Fireball", defender);
                    }
                }
            }
        }
    }
}
