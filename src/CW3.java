import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {
        //������
        int a0[] = new int[10];//���������� �������
        int[] a1 = new int[10];//���������� �������
        int[] cats = new int[]{35, 56, 33};//��� �������� ����� ����� ������  - ������ ����������
        int[] a2 = {10, 123, 158, 25, 4, 4, 3};//������ � �������������� ������� ���� ���� ���������  �.�. ��� ��� �������� ����� ����� ������  - ������ ����������
        System.out.println(Arrays.toString(a0));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        //��� ����������� (����������) ������� ����� ������������ ������
        int size = a2.length;
        System.out.println(size);
        int n = 42;

        //������������� ������� ��� ������ �����
        //�������� �������
        int[] nums = new int[100];//��������� ������ ��� �������
        Random random = new Random();
        int[] nums2 = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            nums2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));


        System.out.println(Arrays.toString(testArray(5, 10)));
        System.out.println(Arrays.toString(testArray(10, 50)));
        int[] aa = testArray(5, 9);
        System.out.println(Arrays.toString(aa));



        float[] f = new float[10000];
        for (int item : aa
        ) {
            System.out.print(item);
        }

       int[] bb = testArray(10, 10);
        Arrays.sort(aa);
        System.out.println(Arrays.toString(bb));
        Arrays.sort(bb);
        System.out.println(Arrays.toString(bb));
        //Arrays.sort(new int[][]{bb}, Collections.reverse());
        Arrays.sort(a2);
        System.out.println("//////////////");
        System.out.println(Arrays.toString(a2));


        System.out.println(Arrays.toString(bb));
        System.out.println(Arrays.binarySearch(a2, 4));
        //����� ��� � ��� ������� � �������
        System.out.println("//////////////////////////////");
        int[] cc =  testArray(10, 15);
        System.out.println(Arrays.toString(cc));
        int min = cc[new Random().nextInt(cc.length)];
        int t = 0;
        for (int i = 0; i < cc.length; i++) {
                if (min > cc[i])
                    min = cc[i];
        }
        System.out.println(min);

        int ran = new Random().nextInt(20);

        int ccc = 0;

        while (true) {

                System.out.println("������� �����");
                Scanner scanner = new Scanner(System.in);
                int m = scanner.nextInt();
                ccc++;
                //char � = (char) System.in.read();

                if(m == ran) {
                    System.out.println("You are win" + ccc);
                    break;
                } else if (m > ran) {
                    System.out.println("�� ����� ������� �����, ���������� ��������");

                }else if (m < ran) {
                    System.out.println("�� ����� ������� �����, ���������� ��������");

                }


        }

    }



    //�����-�������� ��� ���������� �������
    static int[] testArray(int a, int b) {
        int[] ints = new int[a];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(b);//�������� ������ ������� Random
        }


        return ints;
    }
}
