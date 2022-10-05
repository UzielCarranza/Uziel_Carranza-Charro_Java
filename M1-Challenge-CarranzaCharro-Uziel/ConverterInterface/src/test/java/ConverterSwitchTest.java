import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch converterSwitch;

    @Before
    public void setUp() {
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void ShouldReturnAMonthNameBasedOnTheirRespectiveNumberIdentifier() {
        //        Arrange
        int numberMonthIdentifier = 1;
        String expectedMonthsName = "January";

//        ACT
        String actualMonthsName = converterSwitch.convertMonth(numberMonthIdentifier);

//        Assert

        assertEquals(expectedMonthsName, actualMonthsName);
    }

    @Test
    public void ShouldReturnAWarningMessageBecauseNumberIsInvalid() {
        //        Arrange
        int numberMonthIdentifier = 0;
        String expectedWarningMessage = "No month available for that number";
        int numberMonthIdentifierTest2 = 13;


//        ACT
        String actualMonthsName = converterSwitch.convertMonth(numberMonthIdentifier);
        String actualMonthsNameTest2 = converterSwitch.convertMonth(numberMonthIdentifierTest2);

//        Assert

        assertEquals(expectedWarningMessage, actualMonthsName);
        assertEquals(actualMonthsNameTest2, expectedWarningMessage);
    }

    @Test
    public void shouldReturnADayNameBasedOnTheirRespectiveNumberIdentifier() {
        //        Arrange
        int numberDayIdentifier = 1;
        String expectedDaysName = "Monday";

//        ACT
        String actualDaysName = converterSwitch.convertDay(numberDayIdentifier);

//        Assert

        assertEquals(expectedDaysName, actualDaysName);
    }

    @Test
    public void ShouldReturnAWarningMessageBecauseNumberIsInvalidTestForDayConverter() {
        //        Arrange
        int numberDayIdentifier = 0;
        int numberDayIdentifierTest2 = 13;
        String expectedWarningMessage = "No day available for that number";

//        ACT
        String actualDaysName = converterSwitch.convertDay(numberDayIdentifier);
        String actualDaysNameTest2 = converterSwitch.convertDay(numberDayIdentifierTest2);

//        Assert

        assertEquals(expectedWarningMessage, actualDaysName);
        assertEquals(expectedWarningMessage, actualDaysNameTest2);
    }

}