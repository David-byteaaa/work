import java.io.Serializable;

class Book implements Serializable {
    private String isbn;
    private String title;
    private String author;
    private int stock;

    public Book(String isbn, String title, String author, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getStock() { return stock; }

    public void borrow() {
        if (stock > 0) {
            stock--;
            System.out.println("借书成功：" + title);
        } else {
            System.out.println("库存不足：" + title);
        }
    }

    public void returnBook() {
        stock++;
        System.out.println("还书成功：" + title);
    }

    public void display() {
        System.out.println("ISBN:" + isbn + " 书名:" + title + " 作者:" + author + " 库存:" + stock);
    }
}
