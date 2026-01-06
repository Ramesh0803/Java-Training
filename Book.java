class Book {
    String title;
    String author;
    String isbn;
    double price;
    boolean available;

    Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.available = true;
    }

    void displayBook() {
        System.out.println(
            "Title: " + title +
            ", Author: " + author +
            ", ISBN: " + isbn +
            ", Price: " + price +
            ", Available: " + available
        );
    }
}
