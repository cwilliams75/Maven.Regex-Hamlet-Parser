import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //given
        HamletParser hamletParser = new HamletParser();
        String expected = hamletText.replaceAll("Hamlet", "Leon");
        //when
        String actual = hamletParser.changeHamletToLeon(hamletText);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //given
        HamletParser hamletParser = new HamletParser();
        String expected = hamletText.replaceAll("Horatio", "Tariq");
        //when
        String actual = hamletParser.changeHoratioToTariq(hamletText);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        //given
        Boolean actual = hamletParser.findHoratio(hamletText);
        //when
        Pattern pattern = Pattern.compile("Horatio");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHamlet() {
        //given
        Boolean actual = hamletParser.findHoratio(hamletText);
        //when
        Pattern pattern = Pattern.compile("Hamlet");
        //then
        Assert.assertTrue(actual);
    }
}