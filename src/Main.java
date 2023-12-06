public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", 1842, gogol);

        Book.info();
        System.out.println(deadSouls);

        deadSouls.setPublisherYear(2000);

        Book.info();
        System.out.println(deadSouls);

        Author pushkin = new Author("Александр", "Пушкин");
        Book dubrovsky = new Book("Дубровский", 1841, pushkin);
        Book.info();
        System.out.println(dubrovsky);
    }
}