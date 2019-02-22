
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crmol
 */
public class AssertTestExp {

    public AssertTestExp() {

    }

    //assertArrayEquals
    public void testArray() throws Exception {
        String[] ArrayOne = {"Jennifer", "Jacob", "Philip", "Belinda", "Alex"};
        String[] ArrayTwo = {"Jennifer", "Jacob", "Philip", "Belinda", "Alex"};
        //assert equivalency of arrays
        assertArrayEquals(ArrayOne, ArrayTwo);
    }

    //assert similarity & null
    public void similarityTest() throws Exception {
        String elementOne = "Jennifer";
        String elementTwo = "Jacob";
        String elementThree = "Philip";
        String elementFour = "Belinda";
        String elementFive = "Alex";
        String elementSix = null;

        //assert methods
        assertSame(elementOne, elementTwo);
        assertNotSame(elementTwo, elementThree);
        assertNotNull(elementFour);
        assertNull(elementSix);

    }

    //assert equivalency & boolen w/ simple calucation
    public void testEquivalency() throws Exception {
        short numOne = 20;
        short numTwo = 30;
        short numThree = 40;
        short numFour = 50;
        int calcOne = numOne + numTwo;
        int calcTwo = numOne + numTwo + numThree + numFour;

        //check that two ojbects are equal
        assertEquals(calcOne, numThree);
        assertTrue(calcOne < numFour);
        assertFalse(calcTwo < calcOne);
    }

}
