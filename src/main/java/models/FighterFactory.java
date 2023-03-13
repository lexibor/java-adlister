package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FighterFactory
{

    public List<Fighter> generateFighters()
    {
        Fighter f1 = new Fighter();

        f1.setName("Ryu");
        f1.setHitPoints(17);
        f1.setHitPoints(15);
        f1.setMaxDamage(10);

        Fighter f2 = new Fighter("One Punch Man", 9000, 90000000);

        Fighter f3 = new Fighter("Sailor Moon", 1100000, 9);

        List<Fighter> fighters = new ArrayList<>(Arrays.asList(f1, f2, f3));



        return fighters;
    }



}
