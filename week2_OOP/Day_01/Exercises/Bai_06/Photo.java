package week2_OOP.Day_01.Exercises.Bai_06;

import java.util.ArrayList;

class Photo {
    ArrayList<Photo> photos;
    String id;

    // constructor
    public Photo(String id) {
        this.id = id;
    }

    // get ID
    public String getId() {
        return id;
    }

}
