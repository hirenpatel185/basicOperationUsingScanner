package assign2.pkg2014f;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 
 */
public class Assign22014FTest {

    // Streams used to hijack System.out and System.err
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public Assign22014FTest() {
    }

    @Before
    public void setUp() {
        // Hijacking the Out and Err Streams
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        // Resetting the Out and Err Streams
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Test of doExercise4 method, of class Assign22014F.
     */
    @Test
    public void testDoExercise4() {
        String[] expected
                = {"*", "***", "*****", "*******", "*****", "***", "*"};

        Assign22014F.doExercise4();
        String[] actual = outContent.toString().split("\n");

        for (int i = 0; i < expected.length; i++) {
            assertEquals("Testing if " + actual[i] + " equals " + expected[i],
                    expected[i], actual[i].trim());
        }
    }

    /**
     * Test of doExercise9 method, of class Assign22014F.
     */
    @Test
    public void testDoExercise9() {
        String fakeInput = "60\n8\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String expected = "7.5";

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign22014F.doExercise9();
        String actual = outContent.toString();

        assertTrue("Testing if " + actual + " contains " + expected,
                actual.contains(expected));
        System.setIn(null);
    }

    /**
     * Test of doExercise10 method, of class Assign22014F.
     */
    @Test
    public void testDoExercise10() {
        String fakeInput = "62\n71\n85\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String[] expected
                = {"62", "71", "85", "72.6"};

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign22014F.doExercise10();
        String actual = outContent.toString();

        for (int i = 0; i < expected.length; i++) {
            assertTrue("Testing if " + actual + " contains " + expected[i],
                    actual.contains(expected[i]));
        }

        System.setIn(null);
    }

    /**
     * Test of doExercise12 method, of class Assign22014F.
     */
    @Test
    public void testDoExercise12() {
        String fakeInput = "Buffalo";
        byte[] fakeInputArray = fakeInput.getBytes();
        String[] expected
                = {"7", "BUFFALO", "buffalo", "B"};

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign22014F.doExercise12();
        String[] actual = outContent.toString().split("\n");

        for (int i = 0; i < expected.length; i++) {
            assertTrue("Testing if " + actual[i + 1] + " contains " + expected[i],
                    actual[i + 1].contains(expected[i]));
        }

        System.setIn(null);
    }

    /**
     * Test of doExercise16 method, of class Assign22014F.
     */
    @Test
    public void testDoExercise16() {
        String fakeInput = "Bob\n14\nSarnia\nLambton College\nProgrammer\nDog\nRex\n";
        byte[] fakeInputArray = fakeInput.getBytes();
        String expected = 
                "There once was a person named Bob who lived in Sarnia. At the age of 14,"
                + " Bob went to college at Lambton College. Bob graduated and went to work as a"
                + " Programmer. Then, Bob adopted a(n) Dog named Rex. They both"
                + " lived happily ever after.";

        System.setIn(new ByteArrayInputStream(fakeInputArray));
        Assign22014F.doExercise16();
        String actual = outContent.toString();
        
        assertTrue("Testing if " + actual + " matches " + expected,
                actual.contains(expected));
        
        System.setIn(null);
    }

}
