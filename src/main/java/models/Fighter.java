package models;

import java.io.Serializable;
import java.util.List;

public class Fighter implements Serializable //makes information able to be stored somewhere
{
    private int id;
    private String name;
    private int maxDamage;
    private int hitPoints;
    private List<Weapon> weapons;



    // have to have no argument constructor for java beans
    public Fighter()
    {

    }

    public Fighter(String name, int maxDamage, int hitPoints)
    {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }

    public Fighter(String name, int maxDamage, int hitPoints, List<Weapon> weapons)
    {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
        this.weapons = weapons;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
