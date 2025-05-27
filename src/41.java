public class Main {
    public static void main(String[] args) {
        // Example Java program to demonstrate file handling
        try (FileReader reader = new FileReader("file.txt")) {
            int line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
