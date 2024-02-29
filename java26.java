import java.util.Scanner;

class java26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("enter the number");
        int num = sc.nextInt();
        for (int i = 4; i <= num/2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            }
            if (flag == true) {
                System.err.println("number is not prime nunmber");
            } else {
                System.out.println("number is prime");
            }

    }
}
