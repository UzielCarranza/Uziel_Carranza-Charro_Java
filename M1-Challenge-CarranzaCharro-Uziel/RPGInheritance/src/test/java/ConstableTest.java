import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable constable;
    private List<String> constableAbilities;

    @Before
    public void setUp() {
        constableAbilities = new ArrayList<>();
        constableAbilities.add("attack another character");
        constableAbilities.add("arrest another character");
        constable = new Constable("Constable's name");
    }

    @Test
    public void shouldOutPutToTheConsoleTheConstablesCryOfVictory() {
//        arrange
        String expectedString = "Yay";

//        ACT
        String actualString = constable.cryOfVictory();

//        ASSERT
        assertEquals(expectedString, actualString);

    }

    @Test
    public void shouldDrainTheConstablesStaminaWhileRunningIsEqualToTrue() {
        //        arrange
        int expectedStamina = 59;

//        ACT
        constable.setRunning(true);
        constable.drainStaminaOnRunning();
        int actualStamina = constable.getStamina();

//        ASSERT
        assertEquals(expectedStamina, actualStamina);
    }

    @Test
    public void shouldReturnAMessageWhenGettingArrested() {
        //        Arrange
        String expectedMessage = "ufff";

//        ACT
        constable.setArrested(true);
        String actualMessage = constable.laughWhileNotArrested();

//        Assert

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shouldReturnTheNameOfTheConstable() {
        //        Arrange
        String expectedConstableName = "Constable's name";

//        ACT
        String actualConstableName = constable.getName();

//        Assert

        assertEquals(expectedConstableName, actualConstableName);
    }


    @Test
    public void shouldReturnAnIntegerRepresentingTheStrengthOfTheConstable() {
        //        Arrange
        int expectedStrength = 60;

//        ACT
        int actualStrength = constable.getStrength();

//        Assert

        assertEquals(expectedStrength, actualStrength);
    }


    @Test
    public void shouldReturnAStringOfTheConstablesJurisdiction() {
        //        Arrange
        String expectedConstablesJurisdiction = "local";

//        ACT
        String actualJurisdiction = constable.getJurisdiction();

//        Assert

        assertEquals(actualJurisdiction, expectedConstablesJurisdiction);
    }

    @Test
    public void shouldReturnAListRepresentingTheAbilitiesOfConstable() {
        //        Arrange

//        ACT
        List<String> actualConstableAbilities = constable.getAbilities();

//        Assert

        assertEquals(constableAbilities, actualConstableAbilities);
    }

}