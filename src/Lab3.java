import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        System.out.println("Tusk #1");
        System.out.println("input the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        String str1 = " ";
        char c0;
        for (int d = n - 1; d >= 0; d--) {
            c0 = str.charAt(d);
            str1 = str1 + c0;
        }
        System.out.println("The string is in reverse order: " + str1);

        System.out.println("Tusk #2");
        System.out.println("input the string");
        String str2 = scanner.nextLine();
        String str3 = "";
        for (int b = str2.length() - 1; b >= 0; b--) {
            str3 += str2.charAt(b);
        }
        if (str2.equals(str3)) {
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }

        System.out.println("Tusk #3");
        System.out.println("input the string");
        String str4 = scanner.nextLine();
        String[] str5 = str4.split("\\s+");
        System.out.println("Number of words in the string: " + str5.length);

        System.out.println("Tusk Caesar");
        System.out.println("input the string");
        String str6 = scanner.nextLine();
        System.out.println("input the shift");
        int i = scanner.nextInt();
        String str7 = " ";
        for (char c: str6.toCharArray()) {
            int i2 = (int) c;
            if ((i2 >= 1072)&(i2 <= 1103)){
                if (i2 + i <= 1103) {
                    char c2 = (char) (i2 + i);
                    str7 = str7 + c2;
                }
                else {
                    char c2 = (char) (1072 + i2 + i - 1103);
                    str7 = str7 + c2;
                }
            }
            else if ((i2 >= 1040)&(i2 <= 1071)){
                if (i2 + i <= 1071) {
                    char c2 = (char) (i2 + i);
                    str7 = str7 + c2;
                }
                else {
                    char c2 = (char) (1040 + i2 + i - 1071);
                    str7 = str7 + c2;
                }
            }
            else if ((i2 >= 97)&(i2 <= 122)){
                if (i2 + i <= 122) {
                    char c2 = (char) (i2 + i);
                    str7 = str7 + c2;
                }
                else {
                    char c2 = (char) (97 + i2 + i - 122);
                    str7 = str7 + c2;
                }
            }
            else if ((i2 >= 65)&(i2 <= 90)){
                if (i2 + i <= 90) {
                    char c2 = (char) (i2 + i);
                    str7 = str7 + c2;
                }
                else {
                    char c2 = (char) (97 + i2 + i - 122);
                }
            }
            else if ((i2 >= 65)&(i2 <= 90)){
                if (i2 + i <= 90) {
                    char c2 = (char) (i2 + i);
                    str7 = str7 + c2;
                }
                else {
                    char c2 = (char) (65 + i2 + i - 90);
                    str7 = str7 + c2;
                }
            }
            else {
                char c2 = (char) i2;
                str7 = str7 + c2;
            }
        }
        System.out.println("Encoded string: " + str7);
    }
}