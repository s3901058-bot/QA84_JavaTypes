public class MainJavaTypes {
    public static void main(String[] args) {

        int age = 25;
        double price = 19.99;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Ivan";

        System.out.println("=== Java Types Demo ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is student: " + isStudent);
        System.out.println("Grade: " + grade);

        System.out.println();

        int a = 10;
        int b = 3;

        System.out.println("=== Math Demo ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println();

        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }
}