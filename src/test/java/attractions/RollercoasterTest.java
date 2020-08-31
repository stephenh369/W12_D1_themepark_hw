package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor underAgeVisitor;
    Visitor underHeightVisitor;
    Visitor underAgeAndHeightVisitor;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        underAgeVisitor = new Visitor(11, 145, 25);
        underHeightVisitor = new Visitor(13, 135, 25);
        underAgeAndHeightVisitor = new Visitor(10, 125, 25);
        visitor = new Visitor(14, 150, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void willNotAllowUnderAgeOrHeight() {
        assertEquals(false, rollerCoaster.isAllowedTo(underAgeVisitor));
        assertEquals(false, rollerCoaster.isAllowedTo(underHeightVisitor));
        assertEquals(false, rollerCoaster.isAllowedTo(underAgeAndHeightVisitor));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
}
