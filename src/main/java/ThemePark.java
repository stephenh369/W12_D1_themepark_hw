import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed;
        reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }

    public HashMap<String, Integer> getAllReviewedAsHashMap() {
        HashMap<String, Integer> reviewed;
        reviewed = new HashMap<>();
        for (Attraction i : attractions) {
            reviewed.put(i.getName(),i.getRating());
        }
        for (Stall i : stalls) {
            reviewed.put(i.getName(),i.getRating());
        }
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
         attraction.addVisitCount(1);
         visitor.getVisitedAttractions().add(attraction);
    }
}
