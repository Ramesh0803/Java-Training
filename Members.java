import java.util.ArrayList;

class Members {
    String name;
    int id;
    ArrayList<Book> borrowedBooks;

    Members(String name, int id) {
        this.name = name;
        this.id = id;
        borrowedBooks = new ArrayList<>();
    }

    void displayBorrowedBooks() {
        System.out.println("Borrowed Books by " + name + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book b : borrowedBooks) {
                System.out.println("- " + b.title);
            }
        }
    }
}
