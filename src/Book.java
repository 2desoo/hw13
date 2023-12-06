import java.util.Objects;

public class Book {
    private String name;
    private int publisherYear;
    private Author author;

    public Book(String name, int publisherYear, Author author) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publisherYear, author);
    }

    @Override
    public String toString() {
        return "Название книги: " + name +
                "\nГод издания: " + publisherYear +
                "\nАвтор: " + author;
    }

    public static void info() {
        System.out.println("New book");
    }
}
