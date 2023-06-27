package week2_OOP.Day_01.Exercises.Bai_03;

public class FriendContact implements Contact {

    String name;
    String phoneNumber;

    // Constructor
    public FriendContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void getName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void getPhoneNumber() {
        System.out.println("PhoneNumber: " + phoneNumber);
    }

    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + name + ", PhoneNumber: " + phoneNumber);
    }

}
