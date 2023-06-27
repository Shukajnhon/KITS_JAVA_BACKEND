package week2_OOP.Day_01.Exercises.Bai_07;

public class BookProp {
    double price;
    String genre, language;

    // Constructor
    public BookProp(double price, String genre, String language) {
        this.price = price;
        this.genre = genre;
        this.language = language;
    }

    // Getter
    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
