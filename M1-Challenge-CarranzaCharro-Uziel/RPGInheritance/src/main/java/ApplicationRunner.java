import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
//        FARMER
        Farmer farmer = new Farmer("John");
        System.out.println(farmer);
        farmer.setRunning(true);
        farmer.drainStaminaOnRunning();
        System.out.println(farmer);


//        CONSTABLE

        Constable constable = new Constable("Jay");
        System.out.println(constable);

////        WARRIOR
        Warrior warrior = new Warrior("Heroes");
        System.out.println(warrior);
    }
}
