import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class HW1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task number:");
        System.out.println("""
                a) товар А стоит (xx) руб и на него скидка 15%,
                 а товар Б стоит (yy) руб. Клиент взял 10 A и 2 Б.
                 Желаете узнать эту сумму - нажмите 1.\s
                
                """);

        System.out.println("""
                б) товар А стоит (xx) руб и на него скидка 50%,
                 а товар Б стоит (yy) руб. Клиент взял 7 A и 1 Б.
                 Желаете узнать эту сумму - нажмите 2.\s
                
                """);

        System.out.println("""
                в) товар А стоит (xx) руб и на него скидка 10%,\s
                 a товар Б стоит (yy) руб. Клиент взял 2 A и 3 Б.\s
                 Желаете узнать эту сумму - нажмите 3.\s
                
                """);

        System.out.println("""
                2) Пусть цена товара A обычно составляет (xx) руб, " +
                "и товара B составляет (yy) руб. Если клиент покупает товары вместе, " +
                "то на них действует скидка 10% на всю покупку. Выведите на экран " +
                "переменную, которая стоимости суммы A+B со скидкой. " +
                "Отдельно выведите на экран сумму скидки от этой покупки." +
                "Желаете узнать эту сумму - нажмите 4.\s
                
                """);

        System.out.println("""
                3) {Хотите посложнее - решайте задачу 5Пусть x = 5, y = 10; Выведите на экран sqrt (xx + yy);
                Это и есть гипотенуза треугольника со сторонами x, y.
                (Про sqrt узнайте у гугла что это и как добавить его в проект.
                (если что пишите))
                жмите 5!!!

                """);

        System.out.println("""
                4) Тоже решение задачи 3 для чисел введенных с клавиатуры^^
                Жмите - 6

                """);

        System.out.println("""
                5) В переменных q и w хранятся два натуральных числа.
                Создайте программу, выводящую на экран результат деления q на w с остатком.
                Для расчета жмите: 7
                
                """);

        System.out.println("""
                6) В переменной n хранится натуральное трёхзначное число.
                Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
                Для расчета жмите: 8
                
                """);

        System.out.println("""
               
                7) В переменной n хранится вещественное число с ненулевой дробной частью.
                Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
                Для расчета жмите: 9
                
                """);

        System.out.println("""
                
                8) Запустите код. Подумайте, почему программа выдаст отрицательное число вместо двух миллиардов:
                public static void main(String[] args) { System.out.println(Привет!); int z = 2147483647+1; System.out.println(z); }}
                Жмите для запуска этой программы: 10
                
                """);

        System.out.println("""
                
                9) Посчитайте выражения, выведите их на экран: int x = 5, y = 7, z = 0, k = 9;
                z = xx + yy; z = xxx; k = x / z;
                Жмите для запуска этой программы: 11
                
                """);

        System.out.println("""
                
                10) Объявите 10 переменных типа int со значениями 0 ,1, 2, 3, 4, 5, 6, 7, 8, 9.
                Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
                Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
                Распечатайте её через println.
                Объявите ещё одну переменную double. Продейлате тоже самое. Сравните результат");
                Жмите для запуска этой программы: 12
                  
                """);

        System.out.println("""
        
                Перевод чисел из десятичной системы исчисления в n-систему исчисления(кому будет слишком все просто)
                Жмите для запуска этой программы: 13
                
                """);


        int task = scanner.nextInt();
        switch (task) {
            case 1 -> {
                System.out.println("Enter the cost of 1 item:");
                double xx = scanner.nextDouble();
                System.out.println("Enter the cost of 2 item:");
                double yy = scanner.nextDouble();
                double purchase = 10 * xx * 0.15 + 2 * yy;
                System.out.println(purchase);

            }
            case 2 -> {
                System.out.println("Enter the cost of 1 item:");
                double xx = scanner.nextDouble();
                System.out.println("Enter the cost of 2 item:");
                double yy = scanner.nextDouble();
                float purchase = (float) (7 * xx * 0.50 + 1 * yy);
                System.out.println(purchase);

            }
            case 3 -> {
                System.out.println("Enter the cost of 1 item:");
                double xx = scanner.nextDouble();
                System.out.println("Enter the cost of 2 item:");
                double yy = scanner.nextDouble();
                float purchase = (float) (2 * xx * 0.10 + 3 * yy);
                System.out.println(purchase);

            }
            case 4 -> {
                System.out.println("Enter the cost of 1 item:");
                double xx = scanner.nextDouble();
                System.out.println("Enter the cost of 2 item:");
                double yy = scanner.nextDouble();
                System.out.println("Вы хотите купить товары А и В вместе? - напишите y(yes) или n(no)");
                char sc = (char) System.in.read();
                if (sc == 'y') {
                    System.out.println("ok10");
                    System.out.println("Т.к. вы покупаете товар вместе, то у вас скидка 10%");
                    double result = (xx + yy) * 0.9;
                    System.out.println("Итого стоимость товара со скидкой: " + result);
                    double result2 = (xx + yy) * 0.1;
                    System.out.println("Скидка от покупки составляет: " + result2);
                } else if (sc == 'n') {
                    System.out.println("Стоимость товара по отдельности: \n" +
                            "Товар А = " + xx + "\n" +
                            "Товар B = " + yy);
                }

            }
            case 5 -> {
                int x5 = 5, y5 = 10;
                int result1 = (int) pow(x5, 2);
                int result2 = (int) pow(y5, 2);
                double rez = Math.sqrt(result1 + result2);
                System.out.println(rez);

            }
            case 6 -> {
                System.out.println("Введите первый катет треугольника:");
                double a = scanner.nextDouble();
                System.out.println("Введите второй катет треугольника:");
                double b = scanner.nextDouble();
                double rez = Math.sqrt(a * a + b * b);
                System.out.println("Гипотенуза этого трейгольника равна: " + rez);
            }

            case 7 -> {
                System.out.println("Введите первое натуральное число:");
                int q = scanner.nextInt();
                System.out.println("Введите второе натуральное число:");
                int w = scanner.nextInt();
                float rez = (float) q/w;
                System.out.println(rez);
            }

            case 8 -> {
                System.out.println("Введите натуральное трехзначное число: ");
                int n = scanner.nextInt();
                int n1 = n/100;
                int n2 = (n - n1 * 100) / 10;
                int n3 = n - n1 * 100 - n2 * 10;
                int sum = n1 + n2 + n3;
                System.out.println("Сумма чисел: " + n1 + " + " + n2 + " + " + n3 +  " равна: " + sum);

                //2 way:
                System.out.println(" 2 way:Введите натуральное трехзначное число: ");
                int w = scanner.nextInt();
               int sum2 = 0;
                for (int i = 0; i < 3; i++) {
                    sum2 = sum2 + w % 10;
                    w = w / 10;
                }
                System.out.println( sum2);
            }

            case 9 -> {
                System.out.println("Введите вещественное число (например 10,253): ");
                float n = scanner.nextFloat();
                System.out.println("Ближайшее целое: " + Math.round(n));

                //2 way
                System.out.println("Введите 2 вещественное число(например 10,253): ");
                float m = scanner.nextFloat();
                int m1 = (int) m;
                float m2 = m - m1;
                float m4 = m2 % 10;
                    if (m4 >= 1 && m4 <= 4) {
                        System.out.println("Ближайшее целое: " + m1);
                    }
                    else if (m4 >= 5 || m4 <= 9) {
                        m2 = ++m1;
                        System.out.println("Ближайшее целое: " + m2);
                }

            }
            case 10 -> {
                System.out.println("Привет!");
                int z10 = 2147483647;
                System.out.println(z10);
                System.out.println(++z10
                        + "++z10 - Происходит переполнение допустимого значения примитивного типа int" +
                        "и в результате перевод на наименьшее значение этого типа. " +
                        "Диапазон int: -2147483648 до 2147483647" +
                        "Если добавим +2 то будет чотрицательное число увеличено еще на единицу." );

            }

            case 11 -> {
                int x = 5, y = 7, z = 0, k = 9;
                z = x * x + y * y;
                System.out.println(z);
                z = x * x * x;
                System.out.println(z);
                k = x / z;
                System.out.println(k);
            }

            case 12 -> {

                int i1 = 0, i2 = 1, i3 = 2, i4 = 3, i5 = 4,
                        i6 = 5, i7 = 6, i8 = 7, i9 = 8, i10 = 9;
                int average = (i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10) / 10;
                System.out.println(average + "\nЗдесь среднее арифметическое округляется до целого, т.к. все операнды преобразуются к типу int и округление происходит в меньшую сторону" +
                        "int b = (int)Math.round(a); - округлит как положено");
                double average_Double = (double) (i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10) / 10;
                System.out.println(average_Double + "\nЗдесь среднее арифметическое не округляется до целого, т.к. преобразование в тип double" +
                        "он не округляет" +
                        "\nПреобразования при операциях\n" +
                        "\nНередки ситуации, когда приходится применять различные операции, например, сложение и произведение, над значениями разных типов. Здесь также действуют некоторые правила:\n" +
                        "\n" +
                        "если один из операндов операции относится к типу double, то и второй операнд преобразуется к типу double\n" +
                        "\n" +
                        "если предыдущее условие не соблюдено, а один из операндов операции относится к типу float, то и второй операнд преобразуется к типу float\n" +
                        "\n" +
                        "если предыдущие условия не соблюдены, один из операндов операции относится к типу long, то и второй операнд преобразуется к типу long\n" +
                        "\n" +
                        "иначе все операнды операции преобразуются к типу int");
            }

            case 13 ->  {
                System.out.println("Для перевода десятичного числа в двоичную систему введите 1");
                System.out.println("Для перевода двоичного числа в десятичную систему введите 2");
                System.out.println("Для перевода десятичного числа в восьмеричную систему введите 3");
                System.out.println("Для перевода десятичного числа в шестнадцатиричную систему введите 4");
                System.out.println("Для перевода строки в двоичную систему введите 5");
                int sc = scanner.nextInt();
                if (sc == 1){
                    System.out.println("Введите число в десятичном виде которое хотите перевести в двоичный вид");
                    //int n = scanner.nextInt();

                    double nd = scanner.nextDouble();
                    //String n22 = Long.toBinaryString(Double.doubleToRawLongBits(n2));
                    //System.out.println(n22);
                    int nd1 = (int) nd;
                    double nd2 = nd - nd1;

                    //System.out.println("1 way:");
                    String str1 = "";
                    String str2 = "";
                    while (nd1 != 0) {
                        int b = nd1 % 2;
                        str1 = b + str1;
                        nd1 = nd1 / 2;
                    }

                    if (nd2 > 0) {
                    for (int i = 0; i < 11; i++) {
                           nd2 = nd2 * 2;
                           int q = (int) (nd2 % 10);
                           str2 = str2 + q;
                           if (q == 1) {
                               nd2 = nd2 - 1;
                           }
                       }
                    }

                    String str = str1 + str2;
                    System.out.println(str);

                   // System.out.println("2 way for int:");
                    //int n1 = Integer.parseInt(Integer.toBinaryString(nd1));
                    //System.out.println(n1);
                 /*
                 // System.out.println("3 way for int:");
                for (j = 0;  n > 0 ; j++) {
                   num = num + (int) ((n % 2) * Math.pow(10.0, j));
                   n = n / 2;
                }
                System.out.println(num);*/
                }

                if (sc == 2) {
                    System.out.println("Введите двоичное число");
                    int num = scanner.nextInt();
                    System.out.println(Integer.parseInt(String.valueOf(num), 2));
                }

                if (sc == 3 ) {
                    System.out.println("Введите десятичное число");
                    int num = scanner.nextInt();
                    System.out.println(Integer.toHexString(num));
                }

                if (sc == 4 ) {
                    System.out.println("Введите десятичное число");
                    int num = scanner.nextInt();
                    System.out.println(Integer.toOctalString(num));
                }



                if (sc == 5) {
                    System.out.println("Введите строку");
                    String str = scanner.next();
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < str.length(); i++) {
                        char c = str.charAt(i);
                        stringBuilder.append(Integer.toBinaryString(c)).append(' ');
                    }
                    System.out.println(stringBuilder);
                }


            }
        }







    }
}

