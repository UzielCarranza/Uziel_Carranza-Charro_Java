import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior;
    private List<String> expectedWarriorAbilities;

    @Before
    public void setUp() {
        expectedWarriorAbilities = new ArrayList<>();
        warrior = new Warrior("Warrior");
    }

    @Test
    public void shouldOutPutToTheConsoleTheWarriorsCryOfVictory() {
//        arrange
        String expectedString = "Arg";

//        ACT
        String actualString = warrior.cryOfVictory();

//        ASSERT
        assertEquals(expectedString, actualString);

    }

    @Test
    public void shouldDrainTheWarriorsStaminaWhileRunningIsEqualToTrue() {
        //        arrange
        int expectedStamina = 99;

//        ACT
        warrior.setRunning(true);
        warrior.drainStaminaOnRunning();
        int actualStamina = warrior.getStamina();

//        ASSERT
        assertEquals(expectedStamina, actualStamina);
    }

    @Test
    public void shouldReturnAMessageWhenGettingArrested() {
        //        Arrange
        String expectedMessage = "Nooo";

//        ACT
        warrior.setArrested(true);
        String actualMessage = warrior.laughWhileNotArrested();

//        Assert

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shouldReturnTheNameOfTheWarrior() {
        //        Arrange
        String expectedWarriorsName = "Warrior";

//        ACT
        String actualWarriorsName = warrior.getName();

//        Assert

        assertEquals(expectedWarriorsName, actualWarriorsName);
    }

    @Test
    public void shouldReturnAListRepresentingTheAbilitiesOfTheWarrior() {
        //        Arrange
        expectedWarriorAbilities.add("attack another character");

//        ACT
        List<String> actualWarriorAbilities = warrior.getAbilities();

//        Assert

        assertEquals(expectedWarriorAbilities, actualWarriorAbilities);
    }

    @Test
    public void shouldReturnAnIntegerRepresentingTheShieldsStrengthOfTheWarrior() {
        //        Arrange
        int expectedShieldsStrength = 100;

//        ACT
        int actualShieldsStrength = warrior.getShieldStrength();

//        Assert

        assertEquals(expectedShieldsStrength, actualShieldsStrength);
    }

    @Test
    public void shouldReturnABooleanRepresentingIfTheWarriorIsRunnig() {
        //        Arrange
        boolean expectedIsWarriorRunning = false;

//        ACT
        boolean actualIsWarriorRunning = warrior.isRunning();

//        Assert

        assertEquals(expectedIsWarriorRunning, actualIsWarriorRunning);
    }
}