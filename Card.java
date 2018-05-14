import java.util.zip.DataFormatException;

public class Card {

    private int health;
    private int attack;
    private String name;

    public Card(int health, int attack, String name) {
        if(checkHealth(health))
            setHealth(health);
        if(checkAttack(attack))
            setAttack(attack);
        if(checkName(name))
            setName(name);
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private void setAttack(int attack) {
            this.attack = attack;
    }

    private void setName(String name){
        this.name = name;
    }

    private boolean checkHealth(int health) {
        if (health < 1) return false;
        else return true;
    }

    private boolean checkAttack(int attack) {
        if (attack < 0) return false;
        else return true;
    }

    private boolean checkName(String name) {
        if (name.length() < 0) return false;
        else return true;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        if (!getClass().equals(o.getClass())) {
            return false;
        }
        Card card = (Card) o;
        return (card.name == this.name);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\tAttack " + this.attack + "\tHealth " + this.health;
    }
}
