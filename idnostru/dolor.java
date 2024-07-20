import java.util.Scanner;

public class WeeklyStepsTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] steps = new int[7];

        // Collect steps for each day of the week
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print("Enter the number of steps taken on " + daysOfWeek[i] + ": ");
            steps[i] = scanner.nextInt();
        }

        // Output the results
        System.out.println("\nSummary of steps taken each day:");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i] + ": " + steps[i] + " steps");
        }

        scanner.close();
    }
}
