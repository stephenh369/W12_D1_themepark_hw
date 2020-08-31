import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    CandyflossStall candyflossStall;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    @Before
    public void before() {
        dodgems = new Dodgems("Dodgems", 5);
        candyflossStall = new CandyflossStall("Candy Floss", 5, "Joe", ParkingSpot.A4);
        attractions = new ArrayList<>();
        attractions.add(dodgems);
        stalls = new ArrayList<>();
        stalls.add(candyflossStall);
        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(2, themePark.getAllReviewed().size());
    }
}
