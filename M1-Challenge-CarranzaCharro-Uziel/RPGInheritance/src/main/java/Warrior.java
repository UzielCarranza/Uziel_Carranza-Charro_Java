import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {

    private int shieldStrength;

    public Warrior(String name) {
        super(name, 75, 100, 100, 50, 10, false, false, new String[]{"attack another character"});
        this.shieldStrength = 100;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                ", " + super.toString() +
                "} ";
    }

    //    METHODS
    @Override
    String cryOfVictory() {
        return "Arg";
    }

    @Override
    public void drainStaminaOnRunning() {
        super.drainStaminaOnRunning();
    }
    @Override
    public String laughWhileNotArrested() {
        if (isArrested()){
            return "Nooo";
        }
        return "For my lands!!!";
    }

    //    GETTERS AND SETTERS
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getStamina() {
        return super.getStamina();
    }

    @Override
    public void setStamina(int stamina) {
        super.setStamina(stamina);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower();
    }

    @Override
    public void setAttackPower(int attackPower) {
        super.setAttackPower(attackPower);
    }

    @Override
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override
    public void setRunning(boolean running) {
        super.setRunning(running);
    }

    @Override
    public boolean isArrested() {
        return super.isArrested();
    }

    @Override
    public void setArrested(boolean arrested) {
        super.setArrested(arrested);
    }

    @Override
    public List<String> getAbilities() {
        return super.getAbilities();
    }

    @Override
    public void setAbilities(String[] abilities) {
        super.setAbilities(abilities);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
