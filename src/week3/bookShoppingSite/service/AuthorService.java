package week3.bookShoppingSite.service;

import week3.bookShoppingSite.model.Author;

import java.util.HashMap;
import java.util.Map;

public class AuthorService {
    private static Map<String, Author> authors = new HashMap<>();

    public void create(String name, String surname) {

        Author author = new Author(name, surname);
        authors.put(name, author);
    }

    public Author findAuthor(String name){
        return authors.get(name);
    }
}
