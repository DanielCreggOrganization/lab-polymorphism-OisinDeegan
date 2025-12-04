package ie.atu.polymorphism;

public class Fighter extends Character {
    private int attackPower;

    public Fighter(String name, int health, int attackPower) {
        super(name, health);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
    public void attack(Character opponent) {
        System.out.println(getName() + " attacks " + opponent.getName() + " for " + attackPower + " damage.");
        opponent.defend(attackPower);
    }
    // DT equivalalent from Fallout New Vegas;
    @Override
    public void defend(int damage) {
        int reducedDamage = damage-2;
        if (reducedDamage < 0) {
            reducedDamage = 0;
        }
        super.defend(reducedDamage);
    }
    @Override
    public String describe() {
        return "Fighter " + getName() + " has " + getHealth() + " health and " + attackPower + " attack power.";
    }
}
