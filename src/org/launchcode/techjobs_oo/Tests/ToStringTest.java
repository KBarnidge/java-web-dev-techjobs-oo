package org.launchcode.techjobs_oo;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToStringTest {
    Job testJobS1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void blankLineBeforeAndAfter() {
        String testString1 = testJobS1.toString();
        assertTrue((testString1.indexOf('\n') == 0) && (testString1.lastIndexOf('\n') == (testString1.length() - 1)));//
    }
    @Test
    public void formattingLabelsAndLines() {
        ///////////
    }
}
