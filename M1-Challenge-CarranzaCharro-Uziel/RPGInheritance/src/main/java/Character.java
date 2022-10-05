import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Character {

    //    FIELDS
    private String name;

    private int strength;

    private int health;

    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;
    private String[] abilities;

//    CONSTRUCTOR


    public Character(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String[] abilities) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
        this.abilities = abilities;
    }


//    Override methods


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", strength=" + strength +
                        ", health=" + health +
                        ", stamina=" + stamina +
                        ", speed=" + speed +
                        ", attackPower=" + attackPower +
                        ", running=" + running +
                        ", arrested=" + arrested +
                        ", abilities=" + getAbilities();
    }

    //    METHODS
//    all characters will make a distinctive cry of victory
    abstract String cryOfVictory();

    public void drainStaminaOnRunning() {
        if (isRunning() && getStamina() > 5) {
            setStamina(--stamina);
        } else {
            if (!isRunning() && getStamina() < 50) {
                setStamina(stamina++);
            }
        }
    }

    public String laughWhileNotArrested() {
        if (isArrested()) {
            return "not again!!!";
        } else {
            return "hahaha";
        }
    }

//    GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public List<String> getAbilities() {
//        convert array to list
        List<String> listOfAbilities = new ArrayList<>(Arrays.asList(this.abilities));
        return listOfAbilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }
}
