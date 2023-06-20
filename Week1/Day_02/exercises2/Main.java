package Day_02.exercises2;

public class Main {
    public static void main(String[] args) {
        // 1. Tìm các chữ cái trùng nhau có trong 1 chuỗi
        dedupe("This is a string");

        // 2. Tìm và trả về ký tự ở vị trí nhập vào
        System.out.println("2. Tìm và trả về ký tự ở vị trí nhập vào");
        System.out.println(findChar("This is a string", 1));
        System.out.println("3. Tìm và thay thế {} trong chuỗi");
        System.out.println(replace("Local Host Server IP is {}", "127.0.0.1"));
        // System.out.println(replace("{} love his dog, {} prepare to take him out for
        // walking", "Nick"));
        // System.out.println(replace("lorem isum", ""));

        System.out.println(joinStr(",", "a", "b", "c"));
        System.out.println(joinStr("-", "a", "b", "c"));

    }

    // Methods
    // 1. Tìm các chữ cái trùng nhau có trong 1 chuỗi
    public static void dedupe(String str) {
        char[] inputArr = str.toLowerCase().toCharArray();
        int count;
        // String strs = "This is a string";
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (inputArr[i] == inputArr[j] && inputArr[i] != ' ') {
                    count++;
                    inputArr[j] = '0';
                }
            }
            if (count > 1 && inputArr[i] != '0') {
                System.out.println(inputArr[i]);
            }
        }

    }

    // 2. Tìm và trả về ký tự ở vị trí nhập vào
    public static char findChar(String str, int index) {
        char[] stringToArr = str.toCharArray();
        char result = stringToArr[index];
        return result;
    }

    // 3. Tìm và thay thế {} trong chuỗi
    public static String replace(String str, String param) {
        String replaceStr = str.replace("{}", param);
        return replaceStr;
    }

    // 4, Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau
    // khi nối chuỗi
    public static String joinStr(String delimiter, String... strs) {
        String joinString = String.join(delimiter, strs);
        return joinString;
    }

}
