import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {
        //массив
        int a0[] = new int[10];//обьявление массива
        int[] a1 = new int[10];//объявление массива
        int[] cats = new int[]{35, 56, 33};//при создании через блоки памяти  - массив неизменяем
        int[] a2 = {10, 123, 158, 25, 4, 4, 3};//задаем и инициализируем массива этот тоже создается  т.е. при его создании через блоки памяти  - массив неизменяем
        System.out.println(Arrays.toString(a0));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        //Для изменяемого (увеличение) массива лучше использовать списки
        int size = a2.length;
        System.out.println(size);
        int n = 42;

        //инициализация массива при помощи цикла
        //создание массива
        int[] nums = new int[100];//выделение памяти для массива
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
        //поиск мах и мин зачения в массиве
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

                System.out.println("Введите число");
                Scanner scanner = new Scanner(System.in);
                int m = scanner.nextInt();
                ccc++;
                //char с = (char) System.in.read();

                if(m == ran) {
                    System.out.println("You are win" + ccc);
                    break;
                } else if (m > ran) {
                    System.out.println("Вы ввели большое число, попробуйте поменьше");

                }else if (m < ran) {
                    System.out.println("Вы ввели меньшее число, попробуйте побольше");

                }


        }

    }



    //метод-помощник для заполнения массива
    static int[] testArray(int a, int b) {
        int[] ints = new int[a];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(b);//создание нового объекта Random
        }


        return ints;
    }
}
