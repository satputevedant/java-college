public class LibraryBookFinal {
    private final String isbn;
    private final String title;

    public LibraryBookFinal(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public final void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        LibraryBookFinal book = new LibraryBookFinal("978-0135166307", "Core Java");
        book.display();
    }
}
