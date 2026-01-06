import java.util.ArrayList;

class Library {
    ArrayList<Book> books;
    ArrayList<Members> members;

    Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void addMembers(Members member) {
        members.add(member);
    }

    void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            if (b.available) {
                b.displayBook();
            }
        }
    }

    Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    void borrowBook(String title, Members member) {
        Book book = findBookByTitle(title);

        if (book != null && book.available) {
            book.available = false;
            member.borrowedBooks.add(book);
            System.out.println(member.name + " borrowed \"" + book.title + "\"");
        } else {
            System.out.println("Book not available or not found.");
        }
    }

    void returnBook(String title, Members member) {
        Book bookToReturn = null;

        for (Book b : member.borrowedBooks) {
            if (b.title.equalsIgnoreCase(title)) {
                bookToReturn = b;
                break;
            }
        }

        if (bookToReturn != null) {
            bookToReturn.available = true;
            member.borrowedBooks.remove(bookToReturn);
            System.out.println(member.name + " returned \"" + bookToReturn.title + "\"");
        } else {
            System.out.println("This book was not borrowed by the member.");
        }
    }
}
