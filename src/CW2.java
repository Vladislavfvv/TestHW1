import java.util.Scanner;

public class CW2 {
    public static void main(String[] args) {
        /*int a = 5, b = 7;
        if (true) {
            System.out.println("Hi it's true");
        }
        if (!true) {
            System.out.println("Hi it's not true");
        }
        else System.out.println("false");

        a = 10;
        String s;
        s = a < b ? "Hi it's true" : "Hi it's not true";
        //
        if(a>7){
            s = "a > 10";
        }
        else {
            s = "a < 10";
        }
        System.out.println(s);

        //������ � if-else ���� ���������� a ����� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        //int a1 = 1, a2 = 0, a3 = -3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();

        if(num == 0)
            System.out.println("�����");
        else System.out.println("�������");

        System.out.println("Task 2");
        System.out.println("Enter 2 number:");
        int num2 = scanner.nextInt();
        //���� ���������� a ������ ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        if (num > 0) {
            if(num > 0)
                System.out.println("�����");
            else System.out.println("�������");
        }

        //���� ���������� a ������ ��� ����� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        System.out.println("Enter number:");
        int num3 = scanner.nextInt();
        s = num3 > 0 ? "�����" : "�������";
        System.out.println(s);

        //���� ���������� a ������ ��� ����� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        System.out.println("Enter number:");
        int num4 = scanner.nextInt();
        s = num4 >= 0 ? "�����" : "�������";
        System.out.println(s);

        //���� ���������� a ������ ��� ����� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        System.out.println("Enter number:");
        int num5 = scanner.nextInt();
        s = num5 <= 0 ? "�����" : "�������";
        System.out.println(s);

        //���� ���������� a �� ����� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 1, 0, -3.
        System.out.println("Enter number:");
        int num6 = scanner.nextInt();
        s = num6 != 0 ? "�����" : "�������";
        System.out.println(s);

        //���� ���������� a ����� 'test', �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ 'test', '����', 3.
        System.out.println("������� ������");
        String str = scanner.next();
        s = str == "test"? "true" : "false";

        //���� ���������� a ����� '1' � �� �������� � �� ����, �� �������� '�����',
        // ����� �������� '�������'. ��������� ������ ������� ��� a, ������ '1', 1, 3.
*/
        /*
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        //if (c == 1) && instanceof  ? (() (c) - ��� ����������� ����

                System.out.println("Enter number:");


                //System.out.println("Enter number:")) : null;;
        int num7 = scanner.nextInt();
        String s = (num7 == 1) ? "�����" : "�������";
        System.out.println(s);


        for (int i = 0; i < 100; i += 10) {
            System.out.println(i);
            System.out.println("Hi");

        }

         */


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2 != 0) {
            System.out.println("��������");
        }
        else System.out.println("������");

        char c = 'x';
        int [][] MyArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            if(n % 2 == 0) System.out.print("0");
            else System.out.println(c);
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");

        }
/*
        double fx = 0;
        for (int i = -10; i <= 11 ; i++) {
            //���� ������ ������������ � ��������� � ��������
            if(Math.abs(i) == 2) {
                continue;
            }
            if(i  == 0) {
                fx = 0;
                // return; - ����� �� ������ ������ � ������� ��� � ��������
                //���� ��� void � return ��������� ��� ������������� ����� �� ������
            }
            if (i > 0)
            {
                fx =  3 * Math.pow(i, 2) + 2;
            }
            else {
                fx =  Math.pow(27 - i, 0.5) - 3;
            }
            System.out.println("if i = " + i + " f(x)" + fx);


        }
*/
            int i = 1;
            boolean s = true;
            double e = 0.000001;
            float sum = 0;
            float sumPrev;
        do {
             sumPrev = sum;
            sum += (float) 1 /(i * i) ;
            i++;



            } while (Math.abs(sumPrev-sum) > e);
        System.out.println(sumPrev);
        System.out.println(sum);




        int s1 = 0;
        for (int j = 0; j < 100; j++) {
            if(j % 2 == 0)
                s1 = s1 + j;

            else s1 = s1 - j;
        }
        System.out.println(s1);

    }
    
}
