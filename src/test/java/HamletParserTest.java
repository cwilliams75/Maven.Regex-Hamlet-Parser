import org.junit.Before;
import org.junit.Test;

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
        assertTrue((hamletParser.findHamlet(hamletText)));
        //when
        hamletParser.changeHamletToLeon();
        //then
        assertFalse(hamletParser.findHamlet(hamletParser.getHamletData()));
    }

    @Test
    public void testChangeHoratioToTariq() {
        //given
        assertTrue((hamletParser.findHoratio(hamletText)));
        //when
        hamletParser.changeHoratioTariq();
        //then
        assertFalse(hamletParser.findHoratio(hamletParser.getHamletData()));
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}