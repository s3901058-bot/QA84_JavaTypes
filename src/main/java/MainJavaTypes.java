public class MainJavaTypes {
    public static void main(String[] args) {

        // primitive types
        int a = 5; //целое число
        byte b = 127; //маленькое целое число от -128 до 127
        short c = 34; //целое число от -32768 до 32767
        char r = 'A';// один символ в одинарных кавычках
        long m = 2149000000L; //большое целое число в конце ставим L
        double t = 34.8; // дробное число по умолчанию double
        float g = 3.8f; //дробное число в конце ставим f
        boolean x = true; //логическое значение true или false

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
/*
String — это ссылочный тип.
Переменная str хранит ссылку на объект "Hello".
*/
        String str = "Hello";
/*
str1 получает ту же ссылку, что и str.
Теперь str и str1 указывают на один и тот же объект "Hello".
*/
        String str1 = str;
 /*
str2 получает ту же ссылку, что и str1.
Теперь str, str1 и str2 указывают на "Hello".
 */
        String str2 = str1;

        System.out.println(str); // Hello

 /*
String в Java неизменяемый.
Здесь "Hello" не меняется.
Переменная str просто начинает ссылаться на новый объект "Bay".
*/
        str = "Bay";
 /*
str2 теперь тоже начинает ссылаться туда же, куда str.
То есть str2 теперь указывает на "Bay".
  */
        str2 = str;

        System.out.println(str2); // Bay

 /*
 str1 больше ни на что не ссылается.
 null = отсутствие ссылки на объект.

 так как код выводиться последовательно то сперва будет выведенна надпись hello потом она замениться на Bay..
 */
        str1 = null;
    }
}
