public class java22 {
    public static void main(String[] args) {
        // Iterate over numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If i is divisible by 3, skip to the next iteration
            if (i % 3 == 0) {
                System.out.println("Skipping value " + i+" skipped");
                continue; // Skip to the next iteration
            }
            // If i is equal to 7, exit the loop
            if (i == 7) {
                System.out.println("Breaking the loop at " + i);
                break; // Exit the loop
            }
            System.out.println("Current value: " + i);
        }
    }
}
