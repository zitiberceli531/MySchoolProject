import java.util.Scanner;

public class MySchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Display a message asking for the student ID and grade
        System.out.println("Hello " + name + ", please provide your student ID and current grade.");
        
        // Read the student ID from the user
        int studentID = 0;
        if (scanner.hasNextInt()) {
            studentID = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }
        
        // Ask for the student's name again
        System.out.print("Enter your student's name: ");
        String studentName = scanner.nextLine();
        
        // Prompt the user to enter their current age and grade level
        System.out.println("Hello " + name + ", please provide your current age and current grade level.");
        
        // Read the current age from the user
        int currentAge = 0;
        if (scanner.hasNextInt()) {
            currentAge = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }
        
        // Ask for the student's current age again
        System.out.print("Enter your current age: ");
        String currentAgeString = scanner.nextLine();
        
        // Display a message asking if they are a member of the school club or not
        System.out.println("Hello " + name + ", do you want to join the school club? (yes/no)");
        String answer = scanner.nextLine();
        
        // If they say yes, add them to the list of members
        if ("yes".equals(answer)) {
            System.out.print("Please provide a member ID and grade level.");
            int memberID = 0;
            if (scanner.hasNextInt()) {
                memberID = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            }
            
            // Add them to the list of members
            System.out.println("Member added!");
        } else {
            // If they say no, display a message asking if they want to join the school club again
            System.out.print("Would you like to join the school club? (yes/no)");
            String answerAgain = scanner.nextLine();
            
            // If they say yes, add them to the list of members
            if ("yes".equals(answerAgain)) {
                System.out.println("Member added!");
            } else {
                System.out.print("Do you want to add more students? (yes/no)");
                String answerOnceMore = scanner.nextLine();
                
                if ("yes".equals(answerOnceMore)) {
                    // Add them to the list of members
                    System.out.println("Member added!");
                }
            }
        }
    }
}
