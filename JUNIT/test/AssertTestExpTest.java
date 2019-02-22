
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

//This is assert tests to demonstrate jUnit. The expected results can be adjusted to either
// have the tests pass or fail. The goal would be to have all tests pass but depending on what assert
//you use will be how you test different configurations and values.
public class AssertTestExpTest {

    public AssertTestExpTest() {
    }

    @Test
    //assertArrayEquals
    public void testArray() throws Exception {
        String[] ArrayOne = {"Jennifer", "Jacob", "Philip", "Belinda", "Alex"};
        String[] ArrayTwo = {"Jennifer", "Jacob", "Philip", "Belinda", "Alex"};

        //check whether two arrays are equal to each other
        assertArrayEquals(ArrayOne, ArrayTwo);
    }

    @Test
    //assert similarity & null
    public void similarityTest() throws Exception {
        String elementOne = "Jennifer";
        String elementTwo = "Jacob";
        String elementThree = "Philip";
        String elementFour = "Belinda";
        String elementFive = "Alex";
        String elementSix = null;

        //check if two object references point to the same object -- will fail
        assertSame(elementOne, elementOne);

        //check if two object references not point to the same object -- should pass
        assertNotSame(elementTwo, elementThree);

        //check that an object isn't null
        assertNotNull(elementFour);

        //check that an object is null
        assertNull(elementSix);

    }

    @Test
    //assert equivalency & boolen w/ simple calucation
    public void testEquivalency() throws Exception {
        short numOne = 20;
        short numTwo = 30;
        short numThree = 40;
        short numFour = 50;
        int calcOne = numOne + numTwo;
        int calcTwo = numOne + numTwo + numThree + numFour;

        //check that two objects are equal
        assertEquals(calcOne, numFour);

        //check that a condition is true  
        assertTrue(numFour < calcTwo);

        //check that a condition is false  - test should fail
        assertFalse(calcTwo < numThree);

        //assert that checks if a specific value matches an expected one. 
        assertThat(numOne, is(numOne));
    }

}
