package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.nio.file.FileVisitOption;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorOverAge;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorOverAge = new Visitor(16, 135, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void willNotAllowOver15() {
        assertEquals(false, playground.isAllowedTo(visitorOverAge));
    }
}
