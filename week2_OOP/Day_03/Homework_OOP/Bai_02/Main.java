package week2_OOP.Day_03.Homework_OOP.Bai_02;

public class Main {
    // 2. Quản lý thư viện: Xây dựng một hệ thống quản lý thư viện với các lớp như
    // Book, Library và Member. Mỗi cuốn sách có thông tin như tên sách, tác giả và
    // số lượng, và các thành viên có thể mượn và trả sách.
    public static void main(String[] args) {

        Book book1 = new Book("Book1", "Nguyễn Văn A", 3);
        Member member1 = new Member("John", "0975xxxxxx", 18);
        Library library = new Library(null, null);
        library.addBook(book1);
        library.addMember(member1);

        // library.addBook(book1);
        library.showAllBook();

        System.out.println();

    }
}
