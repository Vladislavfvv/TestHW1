import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class HW1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task number:");
        System.out.println("""
                a) ����� � ����� (xx) ��� � �� ���� ������ 15%,
                 � ����� � ����� (yy) ���. ������ ���� 10 A � 2 �.
                 ������� ������ ��� ����� - ������� 1.\s
                
                """);

        System.out.println("""
                �) ����� � ����� (xx) ��� � �� ���� ������ 50%,
                 � ����� � ����� (yy) ���. ������ ���� 7 A � 1 �.
                 ������� ������ ��� ����� - ������� 2.\s
                
                """);

        System.out.println("""
                �) ����� � ����� (xx) ��� � �� ���� ������ 10%,\s
                 a ����� � ����� (yy) ���. ������ ���� 2 A � 3 �.\s
                 ������� ������ ��� ����� - ������� 3.\s
                
                """);

        System.out.println("""
                2) ����� ���� ������ A ������ ���������� (xx) ���, " +
                "� ������ B ���������� (yy) ���. ���� ������ �������� ������ ������, " +
                "�� �� ��� ��������� ������ 10% �� ��� �������. �������� �� ����� " +
                "����������, ������� ��������� ����� A+B �� �������. " +
                "�������� �������� �� ����� ����� ������ �� ���� �������." +
                "������� ������ ��� ����� - ������� 4.\s
                
                """);

        System.out.println("""
                3) {������ ��������� - ������� ������ 5����� x = 5, y = 10; �������� �� ����� sqrt (xx + yy);
                ��� � ���� ���������� ������������ �� ��������� x, y.
                (��� sqrt ������� � ����� ��� ��� � ��� �������� ��� � ������.
                (���� ��� ������))
                ����� 5!!!

                """);

        System.out.println("""
                4) ���� ������� ������ 3 ��� ����� ��������� � ����������^^
                ����� - 6

                """);

        System.out.println("""
                5) � ���������� q � w �������� ��� ����������� �����.
                �������� ���������, ��������� �� ����� ��������� ������� q �� w � ��������.
                ��� ������� �����: 7
                
                """);

        System.out.println("""
                6) � ���������� n �������� ����������� ���������� �����.
                �������� ���������, ����������� � ��������� �� ����� ����� ���� ����� n.
                ��� ������� �����: 8
                
                """);

        System.out.println("""
               
                7) � ���������� n �������� ������������ ����� � ��������� ������� ������.
                �������� ���������, ����������� ����� n �� ���������� ������ � ��������� ��������� �� �����.
                ��� ������� �����: 9
                
                """);

        System.out.println("""
                
                8) ��������� ���. ���������, ������ ��������� ������ ������������� ����� ������ ���� ����������:
                public static void main(String[] args) { System.out.println(������!); int z = 2147483647+1; System.out.println(z); }}
                ����� ��� ������� ���� ���������: 10
                
                """);

        System.out.println("""
                
                9) ���������� ���������, �������� �� �� �����: int x = 5, y = 7, z = 0, k = 9;
                z = xx + yy; z = xxx; k = x / z;
                ����� ��� ������� ���� ���������: 11
                
                """);

        System.out.println("""
                
                10) �������� 10 ���������� ���� int �� ���������� 0 ,1, 2, 3, 4, 5, 6, 7, 8, 9.
                �������� ��� ���� ���������� int � ��������� � �� ����� ���� ����������, �������� �� 10.
                ����������, � ��� ����� ������� �������������� ���� ����� � ����� ����������.
                ������������ � ����� println.
                �������� ��� ���� ���������� double. ���������� ���� �����. �������� ���������");
                ����� ��� ������� ���� ���������: 12
                  
                """);

        System.out.println("""
        
                ������� ����� �� ���������� ������� ���������� � n-������� ����������(���� ����� ������� ��� ������)
                ����� ��� ������� ���� ���������: 13
                
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
                System.out.println("�� ������ ������ ������ � � � ������? - �������� y(yes) ��� n(no)");
                char sc = (char) System.in.read();
                if (sc == 'y') {
                    System.out.println("ok10");
                    System.out.println("�.�. �� ��������� ����� ������, �� � ��� ������ 10%");
                    double result = (xx + yy) * 0.9;
                    System.out.println("����� ��������� ������ �� �������: " + result);
                    double result2 = (xx + yy) * 0.1;
                    System.out.println("������ �� ������� ����������: " + result2);
                } else if (sc == 'n') {
                    System.out.println("��������� ������ �� �����������: \n" +
                            "����� � = " + xx + "\n" +
                            "����� B = " + yy);
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
                System.out.println("������� ������ ����� ������������:");
                double a = scanner.nextDouble();
                System.out.println("������� ������ ����� ������������:");
                double b = scanner.nextDouble();
                double rez = Math.sqrt(a * a + b * b);
                System.out.println("���������� ����� ������������ �����: " + rez);
            }

            case 7 -> {
                System.out.println("������� ������ ����������� �����:");
                int q = scanner.nextInt();
                System.out.println("������� ������ ����������� �����:");
                int w = scanner.nextInt();
                float rez = (float) q/w;
                System.out.println(rez);
            }

            case 8 -> {
                System.out.println("������� ����������� ����������� �����: ");
                int n = scanner.nextInt();
                int n1 = n/100;
                int n2 = (n - n1 * 100) / 10;
                int n3 = n - n1 * 100 - n2 * 10;
                int sum = n1 + n2 + n3;
                System.out.println("����� �����: " + n1 + " + " + n2 + " + " + n3 +  " �����: " + sum);

                //2 way:
                System.out.println(" 2 way:������� ����������� ����������� �����: ");
                int w = scanner.nextInt();
               int sum2 = 0;
                for (int i = 0; i < 3; i++) {
                    sum2 = sum2 + w % 10;
                    w = w / 10;
                }
                System.out.println( sum2);
            }

            case 9 -> {
                System.out.println("������� ������������ ����� (�������� 10,253): ");
                float n = scanner.nextFloat();
                System.out.println("��������� �����: " + Math.round(n));

                //2 way
                System.out.println("������� 2 ������������ �����(�������� 10,253): ");
                float m = scanner.nextFloat();
                int m1 = (int) m;
                float m2 = m - m1;
                float m4 = m2 % 10;
                    if (m4 >= 1 && m4 <= 4) {
                        System.out.println("��������� �����: " + m1);
                    }
                    else if (m4 >= 5 || m4 <= 9) {
                        m2 = ++m1;
                        System.out.println("��������� �����: " + m2);
                }

            }
            case 10 -> {
                System.out.println("������!");
                int z10 = 2147483647;
                System.out.println(z10);
                System.out.println(++z10
                        + "++z10 - ���������� ������������ ����������� �������� ������������ ���� int" +
                        "� � ���������� ������� �� ���������� �������� ����� ����. " +
                        "�������� int: -2147483648 �� 2147483647" +
                        "���� ������� +2 �� ����� �������������� ����� ��������� ��� �� �������." );

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
                System.out.println(average + "\n����� ������� �������������� ����������� �� ������, �.�. ��� �������� ������������� � ���� int � ���������� ���������� � ������� �������" +
                        "int b = (int)Math.round(a); - �������� ��� ��������");
                double average_Double = (double) (i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10) / 10;
                System.out.println(average_Double + "\n����� ������� �������������� �� ����������� �� ������, �.�. �������������� � ��� double" +
                        "�� �� ���������" +
                        "\n�������������� ��� ���������\n" +
                        "\n������� ��������, ����� ���������� ��������� ��������� ��������, ��������, �������� � ������������, ��� ���������� ������ �����. ����� ����� ��������� ��������� �������:\n" +
                        "\n" +
                        "���� ���� �� ��������� �������� ��������� � ���� double, �� � ������ ������� ������������� � ���� double\n" +
                        "\n" +
                        "���� ���������� ������� �� ���������, � ���� �� ��������� �������� ��������� � ���� float, �� � ������ ������� ������������� � ���� float\n" +
                        "\n" +
                        "���� ���������� ������� �� ���������, ���� �� ��������� �������� ��������� � ���� long, �� � ������ ������� ������������� � ���� long\n" +
                        "\n" +
                        "����� ��� �������� �������� ������������� � ���� int");
            }

            case 13 ->  {
                System.out.println("��� �������� ����������� ����� � �������� ������� ������� 1");
                System.out.println("��� �������� ��������� ����� � ���������� ������� ������� 2");
                System.out.println("��� �������� ����������� ����� � ������������ ������� ������� 3");
                System.out.println("��� �������� ����������� ����� � ����������������� ������� ������� 4");
                System.out.println("��� �������� ������ � �������� ������� ������� 5");
                int sc = scanner.nextInt();
                if (sc == 1){
                    System.out.println("������� ����� � ���������� ���� ������� ������ ��������� � �������� ���");
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
                    System.out.println("������� �������� �����");
                    int num = scanner.nextInt();
                    System.out.println(Integer.parseInt(String.valueOf(num), 2));
                }

                if (sc == 3 ) {
                    System.out.println("������� ���������� �����");
                    int num = scanner.nextInt();
                    System.out.println(Integer.toHexString(num));
                }

                if (sc == 4 ) {
                    System.out.println("������� ���������� �����");
                    int num = scanner.nextInt();
                    System.out.println(Integer.toOctalString(num));
                }



                if (sc == 5) {
                    System.out.println("������� ������");
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

