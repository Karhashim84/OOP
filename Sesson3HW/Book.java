package Sesson3HW;

public class Book {
    private String title;
    private String author;
    private int publichedYear;

    public Book(String title, String author, int publichedYear) {
        this.title = title;
        this.author = author;
        this.publichedYear = publichedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublichedYear() {
        return publichedYear;
    }

    @Override
    public String toString() {
        return "Название: " + title +
                "\nАвтор: " + author +
                "\nГод издания: " + publichedYear;
    }
}
