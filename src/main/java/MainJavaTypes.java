public class MainJavaTypes {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        byte a = 10;   //маленькое целое число
        short b = 1000; // целое число
        int age = 25; // обычное целое число
        long population = 8000000000L; // большое целое число

        float price = 10.5f; // дробное число
        double salary = 2500.75;// дробное число, точнее чем float

        char grade = 'A'; // один символ
        boolean isActive = true; // правда/ложь

        System.out.println(a);
        System.out.println(b);
        System.out.println(age);
        System.out.println(population);
        System.out.println(price);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isActive);


        String str = "Hello";
        String str1 = str;
        String str2 = str1;
        System.out.println(str2);

    }
}






/*public class MainJavaTypes {
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

 */