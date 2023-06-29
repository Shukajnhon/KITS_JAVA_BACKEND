package week2_OOP.Day_03.Homework_OOP.Bai_02;

import java.util.ArrayList;
import java.util.List;

class Library {
    // Create books list
    List<Book> books = new ArrayList<>();

    // Create members list
    List<Member> members = new ArrayList<>();

    // Constructor
    public Library() {
        this.books = null;
        this.members = null;
    }

    public Library(List<Book> books, List<Member> members) {
        this.books = books;
        this.members = members;
    }

    // methods

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Create a book
    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void showAllBook() {
        System.out.println(books);
        // for (Book book : books) {
        // System.out.println("NameOfBook: " + book.getNameOfBook());
        // }
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
        System.out.println(members);
    }

    // Delete a member
    public void deleteMember(Member member) {
        members.remove(member);
        System.out.println(members);
    }

}
