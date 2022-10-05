import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FarmerTest {
    private Farmer farmer;
    private List<String> farmersAbilities;

    @Before
    public void setUp() {
        farmersAbilities = new ArrayList<>();
        farmersAbilities.add("attack another character");
        farmer = new Farmer("farmerName");
    }

    @Test
    public void shouldOutPutToTheConsoleTheFarmersCryOfVictory() {
//        arrange
        String expectedString = "Yiii";

//        ACT
        String actualString = farmer.cryOfVictory();

//        ASSERT
        assertEquals(expectedString, actualString);

    }

    @Test
    public void shouldDrainTheFarmersStaminaWhileRunningIsEqualToTrue() {
        //        arrange
        int expectedStamina = 74;

//        ACT
        farmer.setRunning(true);
        farmer.drainStaminaOnRunning();
        int actualStamina = farmer.getStamina();

//        ASSERT
        assertEquals(expectedStamina, actualStamina);
    }


    @Test
    public void shouldReturnAMessageWhenGettingArrested() {
        //        Arrange
        String expectedMessage = "dang it";

//        ACT
        farmer.setArrested(true);
        String actualMessage = farmer.laughWhileNotArrested();

//        Assert

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shouldReturnTheNameOfTheFarmer() {
        //        Arrange
        String expectedFarmersName = "farmerName";

//        ACT
        String actualFarmersName = farmer.getName();

//        Assert

        assertEquals(expectedFarmersName, actualFarmersName);
    }

    @Test
    public void shouldReturnFalseIfFarmerIsHarvesting() {

//        ACT
        boolean actualIsFarmerHarvesting = farmer.isHarvesting();

//        Assert

        assertFalse(actualIsFarmerHarvesting);
    }

    @Test
    public void shouldChangeTheFarmersName() {
        //        Arrange
        String expectedFarmersName = "farmerNameChanged";

//        ACT
        farmer.setName(expectedFarmersName);
        String actualFarmersName = farmer.getName();

//        Assert

        assertEquals(expectedFarmersName, actualFarmersName);
    }

    @Test
    public void shouldReturnAListRepresentingTheAbilitiesOfTheFarmer() {
        //        Arrange

//        ACT
        List<String> actualFarmersAbilities = farmer.getAbilities();

//        Assert

        assertEquals(farmersAbilities, actualFarmersAbilities);
    }

}