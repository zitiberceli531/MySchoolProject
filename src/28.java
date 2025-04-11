public class SchoolJava {
    public static void main(String[] args) {
        // Example of using Java 8 streams

        int total = 10;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= total; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        System.out.println("Numbers from 1 to " + total + ": " + numbers);

        // Example of using Java 8 lambdas

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .limit(5) // limit the output to the first 5 elements
                .collect(Collectors.toList());

        System.out.println("Even numbers from 1 to " + total + ": " + evenNumbers);
    }
}
