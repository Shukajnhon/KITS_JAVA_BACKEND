package week2_OOP.Day_03.Exercises.Bai_06_Collection;

public class Main {
    // 6. Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó
    // (3d)
    public static void main(String[] args) {
        // System.out.println(wordCounter(
        // "I slowly walked, step by step, through the tranquil forest, feeling the
        // softness of the leaves under my feet and the whispers of the wind through the
        // trees",
        // "step"));

        System.out.println(wordCounter(
                "I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees",
                "the"));
    }

    static int wordCounter(String text, String word) {
        int count = 0;
        String newStr[] = text.replaceAll(",", "").split(" ");

        for (String str : newStr) {
            // System.out.println(str.equals(word));
            if (str.equals(word)) {
                count++;
                // System.out.println("Count: " + count);
            }

        }

        return count;

    }
}
