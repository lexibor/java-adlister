package models;

import java.io.Serializable;

public class Author implements Serializable
{
    private int id;
    private String name;
    private boolean deceased;

    public Author()
    {

    }

    public Author(String name, boolean deceased)
    {
        this.name = name;
        this.deceased = deceased;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }
}
