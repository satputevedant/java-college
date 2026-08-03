package library;
public class Book { private final int id; private final String title, author; private final double price; public Book(int id, String title, String author, double price) { this.id = id; this.title = title; this.author = author; this.price = price; } public void display() { System.out.println(id + " | " + title + " | " + author + " | Rs. " + price); } }
