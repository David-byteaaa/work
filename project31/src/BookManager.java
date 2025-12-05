import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        Collections.sort(books, Comparator.comparing(Book::getIsbn));
        for (Book book : books) {
            book.display();
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.borrow();
                return;
            }
        }
        System.out.println("未找到ISBN：" + isbn);
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("未找到ISBN：" + isbn);
    }

    public void saveToFile(String fileName) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(books);
        oos.close();
        System.out.println("保存成功：" + fileName);
    }

    public void loadFromFile(String fileName) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        books = (ArrayList<Book>) ois.readObject();
        ois.close();
        System.out.println("加载成功：" + fileName);
    }
}
