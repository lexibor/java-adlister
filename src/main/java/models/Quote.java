package models;

import java.io.Serializable;
import java.util.List;

public class Quote implements Serializable
{
    private int id;
    private String quote;
    private Author author;

    public Quote()
    {

    }

    public Quote(String quote, Author author) {
        this.quote = quote;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
