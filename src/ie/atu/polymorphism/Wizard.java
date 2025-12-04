package ie.atu.polymorphism;

public class Wizard extends Character {
    private int mana;

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }
    public void castSpell(String spellName, Character target) {
        if (mana >= 10) {
            System.out.println(getName() + " casts " + spellName + " on " + target.getName() + "!");
            mana -= 10;
            target.changeHealth(-20);
        } else {
            System.out.println(getName() + " does not have enough mana to cast " + spellName + "!");
        }
    }

    @Override
    public String describe() {
        return super.describe() + " It is a wizard with " + mana + " mana.";
    }
    
}
