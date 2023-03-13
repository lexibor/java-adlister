package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FighterFactory
{

    public List<Fighter> generateFighters()
    {
        Fighter f1 = new Fighter("Ryu", 17, 10);

        Fighter f2 = new Fighter("One Punch Man", 9000, 90000000);

        Fighter f3 = new Fighter("Sailor Moon", 1100000, 9, new ArrayList<>(Arrays.asList(new Weapon("Staff", "Magic", "very far", 900000))));

        List<Fighter> fighters = new ArrayList<>(Arrays.asList(f1, f2, f3));



        return fighters;
    }



}
