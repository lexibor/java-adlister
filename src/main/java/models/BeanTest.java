package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeanTest
{
    public static void main(String[] args)
    {
        Album album1 = new Album("Michael Jackson", "Thriller", 1982, "Pop/Rock/R&B", 47.3);
        Album album2 = new Album("Pink Floyd", "The Dark Side of the Moon", 1973, "Progressive rock", 24.2);

        Author author1 = new Author("JRR Tolkien", true);
        Author author2 = new Author("Kentaro Miura", true);

        Quote q1 = new Quote("\"All that is gold does not glitter, not all those who wander are lost; the old that is strong does not wither, deep roots are not reached by the frost.\"", author1);

        Quote q2 = new Quote("\"May the wind under your wings bear you where the sun sails and the moon walks\"", author1);

        Quote q3 = new Quote("\"Hate is a place where a man who can't stand sadness goes\"", author2);

        Quote q4 = new Quote("\"Living for the future is more important than trying to avenge the past.\"", author2);

        List<Author> authors = new ArrayList<>(Arrays.asList(author1, author2));
        List<Quote> quotes = new ArrayList<>(Arrays.asList(q1, q2, q3, q4));

        for(Author author : authors)
        {
            System.out.printf("%s has the following quotes: %n", author.getName());

            for(Quote quote : quotes)
            {
                if(author.getName().equals(quote.getAuthor().getName()))
                {
                    System.out.println(quote.getQuote() + "\n");
                }
            }
        }

    }
}
