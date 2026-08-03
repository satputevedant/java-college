public class LibraryBookFinal {
    static class Book { final String isbn; String title, author; double price; Book(String isbn, String title, String author, double price) { this.isbn = isbn; this.title = title; this.author = author; this.price = price; } void show() { System.out.println(isbn + " | " + title + " | " + author + " | Rs. " + price); } }
    public static void main(String[] args) { new Book("978-0134685991", "Effective Java", "Joshua Bloch", 899).show(); }
}
