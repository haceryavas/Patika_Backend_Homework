package week3.bookShoppingSite.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book extends Product{
    private List<Author> authors = new ArrayList<>();
    private LocalDate publishedDate;
    private LocalDate createdDate;


    public Book(String name, double price, List<Author> authors, LocalDate publishedDate) {
        super(name, price);
        this.authors = authors;
        this.publishedDate = publishedDate;
        createdDate = LocalDate.now();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBook { " +
                "authors = " + authors +
                ", publishedDate = " + publishedDate +
                ", createdDate = " + createdDate +
                " } \n";
    }

}
