package models;

import java.io.Serializable;

public class Weapon implements Serializable
{
    private String name;
    private String type;
    private String range;
    private int maxDmg;

    public Weapon()
    {

    }

    public Weapon(String name, String type, String range, int maxDmg)
    {
        this.name = name;
        this.type = type;
        this.range = range;
        this.maxDmg = maxDmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }
}
