package week2_OOP.Day_03.Homework_OOP.Bai_02;

class Book {
    private String nameOfBook, author;
    private int amount;

    // Constructor
    public Book(String nameOfBook, String author, int amount) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.amount = amount;
    }

    // getter and setter
    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
