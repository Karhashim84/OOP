package task7;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publishedYear;
    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    public String getTitle() { // по названию книги
        return title;
    }
    //public String getAuthor() { // по автору
    //    return author;
    //}
    @Override
    public int compareTo(Book otherBook) {
        return this.author.compareTo(otherBook.getTitle());
    //public int compareTo(Book otherBook) {
    //    return this.title.compareTo(otherBook.getAuthor());
    }
    @Override
    public String toString() {
        return "Book{*" +
                "title='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
