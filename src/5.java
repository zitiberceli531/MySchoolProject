import java.util.*; 
import java.io.*; 

public class MySchoolProject { 
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        String name = scanner.nextLine(); 
        System.out.println("Hello, " + name + ". Welcome to your school project!"); 
        int age = scanner.nextInt(); 
        if (age < 18) { 
            System.out.println("You are not eligible to participate in this project."); 
        } else { 
            System.out.println("You are eligible to participate in this project."); 
        } 
    } 
}