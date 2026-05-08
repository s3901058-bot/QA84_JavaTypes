public class MainRefTypes {
    public static void main(String[] args){
        int a = 5;// Присваем переменной А число 5
        int b = a;// теперь B тоже равна А
        if (a == b) // Если А равна Б то есть == Это равенство
            System.out.println("a == b"); // тут мы просто выводим сообщения а+ь это не переменные это просто текст

        String str = "hello";// обьект из String pool то есть создаем переменную str и присваиваем ей текст hello
        String str1 = new String("hello");// Создаём новый отдельный объект String в памяти с текстом "hello"
        String str2 = "hello"; // Создаеться тот же обьект из String pool
        if (str == str1) // Если str == str1 то будет False так как обьекты разные Если заменить на str2 будет true так как обьекты одинаковые
            System.out.println("equals =="); // это результат на True
        else // если с условия если стр равна стр1  тогда выводиться этот результат
            System.out.println("not equals ==");// Это результат на False

    }
}
/*
В общем как работает эта кусок КОда
Строка где
 */