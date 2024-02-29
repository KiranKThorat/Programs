import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print its all substrings:");
        String str = sc.nextLine();
        System.out.println("Substrings of \"" + str + "\" are:");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
