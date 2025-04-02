import java.util.Scanner;

public class MySchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!");
        
        while (true) {
            System.out.print("Enter a command: ");
            String input = scanner.nextLine();
            
            if ("exit".equalsIgnoreCase(input)) {
                break;
            } else {
                executeCommand(input);
            }
        }

        scanner.close();
    }

    private static void executeCommand(String command) {
        // Example: Execute a simple operation like "print" or "sleep"
        switch (command.toLowerCase()) {
            case "print":
                System.out.println("Print statement executed.");
                break;
            case "exit":
                System.out.println("Exiting program. Goodbye!");
                return;
            default:
                System.out.println("Unknown command: " + command);
                break;
        }
    }
}
