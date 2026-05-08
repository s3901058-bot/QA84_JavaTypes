public class MainRefTypes {
    public static void main(String[] args){
        int a = 5;
        int b = a;
        if (a == b)
            System.out.println("a == b");

        String str = "hello";
        String str1 = new String("hello");
        String str2 = "hello";
        if (str == str2)
            System.out.println("equals ==");
        else
            System.out.println("not equals ==");
        String copy = str;

    }
}
/*

 */