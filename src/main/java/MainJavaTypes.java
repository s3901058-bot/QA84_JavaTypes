public class MainJavaTypes {
    public static void main(String[] args) {

        // primitive types
        int a = 5; //обычное целое число
        byte b = 127; //маленькое целое число
        short c = 34; //целое число
        char r = 'A'; //один символ
        long m = 2149000000L; //большое целое число
        double t = 34.8; //дробное число, точнее чем float
        float g = 3.8f; //дробное число
        boolean x = true; //правда/ложь

        // reference type
        String s = "Hello Java";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(r);
        System.out.println(m);
        System.out.println(t);
        System.out.println(g);
        System.out.println(x);
        System.out.println(s);

        String str = "Hello";
        String str1 = str;
        String str2 = str1;
        System.out.println(str2);

    }
}
