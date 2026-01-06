public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Programming", "James Gosling", "ISBN001", 450));
        library.addBook(new Book("Data Structures", "Mark Allen", "ISBN002", 550));
        library.addBook(new Book("Operating Systems", "Silberschatz", "ISBN003", 600));

        // Add members
        Members m1 = new Members("Ramesh", 101);
        Members m2 = new Members("Suresh", 102);

        library.addMembers(m1);
        library.addMembers(m2);

        // Display available books
        library.displayAvailableBooks();

        // Borrow books
        library.borrowBook("Java Programming", m1);
        library.borrowBook("Data Structures", m2);

        // Display after borrowing
        library.displayAvailableBooks();

        // Show borrowed books
        m1.displayBorrowedBooks();
        m2.displayBorrowedBooks();

        // Return book
        library.returnBook("Java Programming", m1);

        // Final available books
        library.displayAvailableBooks();
    }
}
