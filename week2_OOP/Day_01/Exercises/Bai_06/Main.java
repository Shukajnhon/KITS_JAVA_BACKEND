package week2_OOP.Day_01.Exercises.Bai_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Iphone ip01 = new Iphone(new ArrayList<Photo>(new Photo("cat.jpg")));
        Iphone ip02 = new Iphone();

        ip01.airdrop(ip02, "cat.jpg");
        ip02.getPhoto();

    }
}
