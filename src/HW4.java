import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер задачи");
        System.out.println("0 - Задача на поиск числа в массиве");
        System.out.println("1 - Создать массив целых чисел. " +
                "Удалить все вхождения заданного числа из массива." +
                "Если такого числа нет - выведите сообщение об этом." +
                "В результате должен быть новый массив без указанного числа.");
        System.out.println("2 - Создайте и заполните массив случайными числами" +
                "и выведите максимальное, минимальное и среднее значение." +
                "Для генерации случайного сичла используйте метод Math.random()." +
                "Пусть  будет возможность создавать массив произвольног размера" +
                "и вводится он с консоли.");
        System.out.println("3 - Создайте 2 массива. Выведите массивы на консоль." +
                "Посчитайте среднее арифметическое элементов каждого массива и сообщите, " +
                "для какого из массивов это значение оказалось больше (либо сообщите, " +
                "что их средние арифметические равны.)");

        //Additional tasks

        System.out.println("4 - Создайте массив из n случайных чисели выведите его на экран." +
                "Размер массива пусть задается из консоли и размер массива может быть больше 5 " +
                "и меньше или равно 10. " +
                "Если n не удовлетворяет условию - выведите сообщение об этом." +
                "Если пользователь ввёл не подходящее число, то программа должна попросить пользователя повторить ввод." +
                "Создайте 2 массив только из четных элементов первого массива, если они там есть, " +
                "и вывести его на экран.");
        System.out.println("5 - Создайте массив и заполните его." +
                "Выведите массив на экран в строку." +
                "Замените каждый нечетный элемент с нечетным индексом на ноль." +
                "Снова выведите массив на экран на отдельной строке.");
        System.out.println("6 - Создайте массив строк. Заполните его произвольными именами людей." +
                "Отсортируйте массив. Результат выведите в консоль.");
        System.out.println("7 - Сортировка пузырьком");

        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        switch (task) {
            //Task 0\\\\\\\\\\\\\\\\\\
            case 0: {
                System.out.println("Задан следующий массив: ");
                int[] mass = {1, 2, 3, 4, 5, 6, 10, 9, 8, 7, 6, 5};
                int a[] = new int[10];
                System.out.println(Arrays.toString(mass));
                while (true) {
                    System.out.println("Введите число для поиска");
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
                    if (count > 0) System.out.println("Заданное число есть в массиве и повторяется: " + count + " раз" +
                            "\n и его индекс:" + index/*Arrays.toString(a)*/);
                    else System.out.println("Заданное число не входит в массив");
                    /*System.out.println("Проверим еще? y/n");
                    char message = (char) System.in.read();
                    if (message == 'n') break;*/
                }
            }


            //Task1\\\\\\\\\\\\\\\\\\\\\\\
            case 1: {
                System.out.println("Изначальный массив:");
                int[] m = {0, 1, 3, 5, 0, 7, 8, 9, 1, 3, 5, 5, 3, 1, 9, 10, 9, 9};
                int[] m2 = new int[m.length];
                System.out.println(Arrays.toString(m));
                System.out.println("Введите число из массива, которое хотите удалить");
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
                    System.out.println("Цифра " + num + " повторяется: " + count + " раз");
                    System.out.println("Массив после удаления: ");
                    System.out.println(Arrays.toString(m2));
                    System.out.println("Новый массив");
                    soutArray(m2, m2.length);

                } else {
                    System.out.println("В массиве нет такого числа");
                }
                break;
            }

            //Task2\\\\\\\\\\\\\\\\\\
            case 2: {
                System.out.println("Введите размер массива");
                int size = scanner.nextInt();
                System.out.println("Введите диапазон значений массива до:");
                int range = scanner.nextInt();
                int[] tt = fillArr(size, range);
                System.out.println(Arrays.toString(tt));
                minNumber(tt, size);
                maxNumber(tt, size);
                middleNumber(tt, size);

            }

            //Task3\\\\\\\\\\\\\\\\\\
            case 3: {
                while(true) {
                    System.out.println("Введите размер 1 массива");
                    int size1 = scanner.nextInt();
                    System.out.println("Введите диапазон значений  1 массива до:");
                    int range1 = scanner.nextInt();
                    int[] tt = fillArr(size1, range1);
                    System.out.println("Первый массив: " + Arrays.toString(tt));

                    System.out.println("Введите размер 2 массива");
                    int size2 = scanner.nextInt();
                    System.out.println("Введите диапазон значений  1 массива до:");
                    int range2 = scanner.nextInt();
                    int[] tt2 = fillArr(size2, range2);
                    System.out.println("Первый массив: " + Arrays.toString(tt2));

                    int mid1 = average(tt, size1);
                    int mid2 = average(tt2, size2);

                    System.out.println("Среднее арифметическое первого массива: " + mid1);
                    System.out.println("Среднее арифметическое второго массива: " + mid2);
                    System.out.println();
                    if (mid1 > mid2)
                        System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго");
                    else if (mid1 < mid2)
                        System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого");
                    else System.out.println("Средние арифметические двух массивов равны.");
                    System.out.println("Would you like to repeat again? y/n");
                    char c = (char) System.in.read();
                    if (c == 'n') break;;
                }
            }

            case 4: {
                System.out.println("Write the size of the first array:");
                int size1 = scanner.nextInt();

                while ((size1 >= 10) || (size1 < 5)){
                    System.out.println("The array size does not match. Enter a size from 5 to 10. Repeat enter.");
                    System.out.println("Write the size of the first array:");
                    size1 = scanner.nextInt();
                };


                int[] array = createRandomArray(size1);
                System.out.println("Your first massive:");
                System.out.println(Arrays.toString(array));

                int[] array2 = createEvenArray(array);
                System.out.println("Your modified even array:");
                soutArray(array2, array.length);
            }

            case 5: {
                int n = scanner.nextInt();
                int[] arr5 = new int[n];
                Random random = new Random();
                for (int i = 0; i < n; i++) {
                    arr5[i]  = random.nextInt(10);
                }
                System.out.println("Your massive:");
                System.out.println(Arrays.toString(arr5));
                for (int i = 0; i < arr5.length; i++) {
                    if(arr5[i]%2 != 0){
                        arr5[i] = 0;
                    }
                }
                System.out.println(Arrays.toString(arr5));
            }

            case 6:{
                String[] names = {"Sasha", "Tanya", "Dima", "Anton"};
                System.out.println(Arrays.toString(names));
                Arrays.sort(names);
                System.out.println(Arrays.toString(names));
            }

            case 7:{

                int[] arr7 = {1, 5, 7, 3, 8, 2};
                System.out.println(Arrays.toString(arr7));
                //Сортировка пузырьком
                int temp = 0;
                for (int i = 0; i < arr7.length; i++) {
                    //temp = arr7[i];
                    //int k = 0;
                    for (int j = 0; j < arr7.length-1; j++) {
                        if (arr7[j] > arr7[j + 1]){
                            temp = arr7[j + 1];
                            arr7[j + 1] = arr7[j];
                            arr7[j] = temp;
                        }
                    }

                }
                System.out.println(Arrays.toString(arr7));

            }
        }

    }


    public static int[] createEvenArray(int[] arr){
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                b[i] = arr[i];
        }
        //сдвигаем влево элементы массива
        int[] k = new int[b.length];
        for (int i = 0, j = 0; i < b.length; i++) {
            if(b[i] != 0)
            k[j++] = b[i];
        }

        /*System.out.println("Array k:");
        System.out.println(Arrays.toString(k));

        int temp = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] == 0)
                temp = i;
        }
        System.out.println("temp:" + temp);
        int[] k2 = new int[temp];
        for (int i = 0; i < k2.length; i++) {
            k2[i] = k[i];
        }


        System.out.println("Array k2:");
        System.out.println(Arrays.toString(k2));
*/


        return b;
    }

    public static int[] createRandomArray (int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static void minNumber(int[] arr, int a) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение в данном массиве: " + min);
    }

    public static void maxNumber(int[] arr, int a) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение в данном массиве: " + max);


    }


    public static int average(int[] arr, int b){
        int sum = 0;
        int aver = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        aver = Math.round(sum/b);

        return aver;
    }



    public static void middleNumber(int[] arr, int a) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr[i]; i++) {
            sum += arr[i];
            count++;
        }
        int middle = sum / count;
        System.out.println("Среднее арифметическое в данном массиве: " + middle);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] fillArr(int a, int b) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(b);
        }
        return arr;
    }

    public static int[] soutArray(int arr[], int n) {
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





