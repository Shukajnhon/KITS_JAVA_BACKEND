package week2_OOP.Day_01.Exercises.Bai_03;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Friend Contact ======");
        FriendContact friendContact = new FriendContact("Anna", "0975xxxxxxx");
        friendContact.getPhoneNumber();
        friendContact.getName();
        friendContact.displayContactInfo();

        System.out.println("====== Work Contact ======");
        WorkContact workContact = new WorkContact("John", "098xxxxxxxx");
        workContact.getName();
        workContact.getPhoneNumber();
        workContact.displayContactInfo();
    }
}
