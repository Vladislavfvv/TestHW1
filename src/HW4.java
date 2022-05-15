import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) throws IOException {
        System.out.println("������� ����� ������");
        System.out.println("0 - ������ �� ����� ����� � �������");
        System.out.println("1 - ������� ������ ����� �����. " +
                "������� ��� ��������� ��������� ����� �� �������." +
                "���� ������ ����� ��� - �������� ��������� �� ����." +
                "� ���������� ������ ���� ����� ������ ��� ���������� �����.");
        System.out.println("2 - �������� � ��������� ������ ���������� �������" +
                "� �������� ������������, ����������� � ������� ��������." +
                "��� ��������� ���������� ����� ����������� ����� Math.random()." +
                "�����  ����� ����������� ��������� ������ ������������ �������" +
                "� �������� �� � �������.");

        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        switch (task) {
            //Task 0\\\\\\\\\\\\\\\\\\
            case 0: {
                System.out.println("����� ��������� ������: ");
                int[] mass = {1, 2, 3, 4, 5, 6, 10, 9, 8, 7, 6, 5};
                int a[] = new int[10];
                System.out.println(Arrays.toString(mass));
                while (true) {
                    System.out.println("������� ����� ��� ������");
                    int n = scanner.nextInt();
                    int count = 0;
                    int index = 0;
                    for (int i = 0; i < mass.length; i++) {
                        if (mass[i] == n) {
                            count++;
                            index = i;
                            for (int j = 0; j < a.length; j++) {
                                a[j] = mass[i];
                            }
                        }
                    }
                    if (count > 0) System.out.println("�������� ����� ���� � ������� � �����������: " + count + " ���" +
                            "\n � ��� ������:" + index/*Arrays.toString(a)*/);
                    else System.out.println("�������� ����� �� ������ � ������");
                    /*System.out.println("�������� ���? y/n");
                    char message = (char) System.in.read();
                    if (message == 'n') break;*/
                }
            }


            //Task1\\\\\\\\\\\\\\\\\\\\\\\
            case 1: {
                System.out.println("����������� ������:");
                int[] m = {0, 1, 3, 5, 0, 7, 8, 9, 1, 3, 5, 5, 3, 1, 9, 10, 9, 9};
                int[] m2 = new int[m.length];
                System.out.println(Arrays.toString(m));
                System.out.println("������� ����� �� �������, ������� ������ �������");
                int num = scanner.nextInt();
                int count = 0;
                M:
                for (int i = 0; i < m.length; i++) {
                    if (m[i] != num) {
                        m2[i] = m[i];
                    } else {
                        count++;
                        continue M;
                    }
                }
                if (count != 0) {
                    System.out.println("����� " + num + " �����������: " + count + " ���");
                    System.out.println("������ ����� ��������: ");
                    System.out.println(Arrays.toString(m2));
                    System.out.println("����� ������");
                    soutArray(m2, m2.length);

                } else {
                    System.out.println("� ������� ��� ������ �����");
                }
                break;
            }

            //Task2\\\\\\\\\\\\\\\\\\
                case 2: {
                    System.out.println("������� ������ �������");
                    int size = scanner.nextInt();
                    System.out.println("������� �������� �������� ������� ��:");
                    int r = scanner.nextInt();
                    int[] tt = fillArr(size, r);
                    System.out.println(Arrays.toString(tt));
                }
        }

    }

public static int[] fillArr(int a, int b) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random(b);
            arr[i] = random.nextInt();
    }
        return arr;
}

    public static int[] soutArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                System.out.print(arr[i] + ", ");
        }
        return arr;
    }

        /*public static void cleanMassive(int[] m2, int i) {
                int[] newarr = new int[m2.length - 1];
                int new_size = m2.length - (i + 1);
                System.arraycopy(m2, 0, newarr, 0, i);
                System.arraycopy(m2, i + 1, newarr, i, new_size);
                System.out.println(Arrays.toString(newarr));
        }*/
    }





