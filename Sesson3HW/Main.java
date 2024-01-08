package Sesson3HW;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Горе от ума", "Александр Грибоедов", 1822);
        Book book2 = new Book("Капитанская дочка", "Алесандр Пушкин", 1836);
        Book book3 = new Book("Идиот", "Федор Достоевский", 1868);
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println("Исходный список книг:\n");
        library.booksPrint();

        System.out.println("Сортировка по автору:\n");
        library.books.sort(new AuthorComparator());
        library.booksPrint();

        System.out.println("Сортировка по названию:\n");
        library.books.sort(new TitleComparator());
        library.booksPrint();

        System.out.println("Сортировка по году издания:\n");
        library.books.sort(new PublichedYearComarator());
        library.booksPrint();
    }
}
