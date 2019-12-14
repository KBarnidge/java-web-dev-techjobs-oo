package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToStringTest {
    Job testJobS1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PT"), new CoreCompetency("CC"));

    @Test
    public void blankLineBeforeAndAfter() {
        String testString1 = testJobS1.toString();
        assertTrue((testString1.indexOf('\n') == 0) && (testString1.lastIndexOf('\n') == (testString1.length() - 1)));//
    }
    @Test
    public void formattingLabelsAndLines() {
        String testString2 = testJobS1.toString();
        String testString2x = "\nID: 1\nName: Name\nEmployer: Employer\nLocation: Location\nPosition Type: PT\nCore Competency: CC\n";
        assertEquals(testString2, testString2x);
    }
    @Test
    public void emptyField() {
        Job testJobS3 = new Job("Name", new Employer(""), new Location("LC"), new PositionType("PT"), new CoreCompetency("CC"));
        String testString3 = testJobS3.toString();
        String testString3x = "\nID: 3\nName: Name\nEmployer: Data not available\nLocation: LC\nPosition Type: PT\nCore Competency: CC\n";
        assertEquals(testString3, testString3x);
    }
}
