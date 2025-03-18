import java.util.Random;

public class MySchoolProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Generated random number: " + number);
    }
}
