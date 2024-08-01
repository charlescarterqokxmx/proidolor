import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total votes: ");
        int totalVotes = scanner.nextInt(); // Read an integer input
        
        System.out.println("Total votes entered: " + totalVotes);
        
        scanner.close(); // Close the scanner to release resources
    }
}
