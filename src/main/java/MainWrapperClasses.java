public class MainWrapperClasses {
    public static void main(String[] args) {
        int a = 6;// приметивный
        Integer a1 = 7;// Ссылочный
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String str = "23";
        String str1 = "33";
        System.out.println(str + str);//concat
        int num1 = Integer.parseInt(str);    // из стринга в цыфру имя класса точно статический метод
        // Static method (Class + . + method)
        int num2 = Integer.parseInt(str1);
        System.out.println(num1 + num2);

        Double d1 = 45.2;
        Double d2 = 33.7;
        String str2 ="4.5";
        String str3 = "5.6";
        System.out.println(str2 + str3);
        double d3 = Double.parseDouble(str2);
        double d4 = Double.parseDouble(str3);
        System.out.println(d3 + d4);

        byte b1 = 4;
        byte b2 = 7;
        System.out.println(b1 + b2);
        long l1 = 34;
        long l2 = 98L;
        System.out.println(l1 + l2);

        boolean y = true;
        boolean z = false;
        System.out.println(y);

        float f1 = 4.2f;
        Float f2 = 5.2f;

        short s1 = 67;
        Short s2 = 45;

        char c1 = 'U';
        Character c2 = 'T';



    }
}
