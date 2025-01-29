import java.util.Scanner; // Import Scanner class

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        scanner.close(); // Close scanner to prevent resource leak

        // Grade Calculation
        if (score == 100) {
            System.out.println("Grade: A+");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        // Feedback Based on Score
        switch (score / 10) {
            case 10: 
                System.out.println("Flawless victory! 🎯");
                break;
            case 9:
                System.out.println("Excellent work!");
                break;
            case 8:
                System.out.println("Great job!");
                break;
            case 7:
                System.out.println("Good effort!");
                break;
            case 6:
                System.out.println("Not quite.");
                break;
            case 5:
                System.out.println("See me after class.");
                break;
            default:
                System.out.println("Put the fries in the bag!");
        }
    }
}
