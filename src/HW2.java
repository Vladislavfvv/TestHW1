import java.io.IOException;
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) throws IOException {
        System.out.println("�������� ���������: ������� �����");

        System.out.println("1 - �������� ��������� ��� ������ �������� ���� ���� �� ������ ������" +
                "��� ������� ������������ �������� switch-case");

        System.out.println("2 - �������� ��������� ��� ������ �������� ���� ���� �� ������ ������" +
                "��� ������� ����������� �������� if-else-if");

        System.out.println("3 - �������� ��������� ������� ����� ��������� �� ���� ����� " +
                "� �� ����� ����� �������� ��������� ������ ����� ��� ���." +
                "��� ���������� �������� ����� ����������� �������� ��������� ������� �� ������� %2");

        System.out.println("4 - ��� ���������� ����� t(����������� �� �����) �������" +
                "���� t>40, �� ������� \"�����\" " +
                "���� 40>=t>-5, �� ������� \"�����\"." +
                "���� -5>=t>-20, �� ������� \"���������\"." +
                "���� -20>=t, �� ������� \"�������\".");

        System.out.println("5 - �� ���������� ������ ���������� ���� ������ (1 - �������, 4 - ������� � �.�.) ");

        //�����
        System.out.println("6 - ��� ������ ����� for ������� �� ����� ��� �������� ����� �� 1 �� 99." +
                "��� ������� ����������� �������� ���������� (++)");
        System.out.println("7 - ���������� ������� �� ����� ����� �� 5 �� 1. " +
                "��� ������� ����������� �������� ���������� (--)");
        System.out.println("8 - �������� ���������, ��� ������������ ������ ����� �����" +
                "�����. � ��������� ��������� ��� ����� �� 1 �� ����� �����." +
                "��� ����� �������������� ������� Scanner");
        System.out.println("9 - ���������, ����� ��������� �������� �� ����� ��� ����� ������������������:" +
                "7 14 21 28 35 42 49 56 63 70 77 84 91 98." +
                "� ������� ����������� ���� while");
        System.out.println("10 - ������� 10 ����� ������������������: 0, -5, -10, -15, ..");
        System.out.println("11 - ��������� ���������, ��������� �� ����� �������� ����� �� 10 �� 20 ������������.");

        //�������������� �������
        System.out.println("12 - �������� �� ����� ������ 11 ������ ������������������ ���������.");
        System.out.println("13 - �������� ���������, � ������� ������������ ������ ����� ������ � ���������� �������. " +
                "� ���� ��������� �������� ����� � ������ ���������� �� ��������� �����. ������� ������ 7%.");
        System.out.println("14 - �������� ���������, ������� ������� �� ������� ������� ���������.");
        System.out.println("15 - � ������ N ������ � ������� �������������� �� �������� �������� �������. " +
                "������ ������ ���������� ���� ���������� � ������� ���������� ����� ������� � �������� �� 000001 �� 999999. " +
                "����������� ��������� ������� � �������� ����� ������ ��� ���� ������ ����� ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102 ��� 567576. " +
                "���������� ���� ������ �������� ������� ���������� ������� ����������� ������ � ������ �����������, ��� ����� ��������� �����������. " +
                "� ������� ��������� ����������� ������� ���������� ������� � ����� ������?");

        System.out.println("16 - � ������ N ���� ������� ����� �� ������� ���������� 50000 ��������� �����. " +
                "��� �������� ���������� ����������� ������ ������ �������� ��� ������ ����� �������� � ������� �� 00001 �� 50000 � ������� ����������, " +
                "�� ����� �������� ����������, ��������� ��� �������� ������ ��-�� ������������� �� ������� ����� 2, ������� ��� ��������, " +
                "� ������� ������� ����������� ���� ��� ����� ������ (��������, 00002 ��� 20202) � ���� ��������������. " +
                "�������� ���������, ������� ���������� ������� ����� ����� ��������� �������� ��������� � ����������� ������.");

        System.out.println("17 - " +
                "����������� ���� ���������� ����� � ������� �� 00:00 �� 23:59. " +
                "���������� ������� ��� �� ����� ��������� ���, ��� ����� �� ��������� ������������ ������������ ���������� ��� ���, " +
                "��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51).");

        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();


        switch (sc) {
            case 1: {
                System.out.println("������� ����� ������");
                int month = scanner.nextInt();
                switch (month) {
                    case 1, 2, 12: {
                        System.out.println("It's winter");
                        break;
                    }
                    case 3, 4, 5: {
                        System.out.println("It's spring");
                        break;
                    }
                    case 6, 7, 8: {
                        System.out.println("It's summer");
                        break;
                    }
                    case 9, 10, 11: {
                        System.out.println("It's autumn");
                        break;
                    }

                    default:{
                        System.out.println("�� ����� ������������ �����");
                    }

                }

            }

            case 2: {
                System.out.println("������� ����� ������");
                int month = scanner.nextInt();
                if (month == 1) {
                    System.out.println("It's January");
                    break;
                } else if (month == 2) {
                    System.out.println("It's February");
                    break;
                } else if (month == 3) {
                    System.out.println("It's March");
                    break;
                } else if (month == 4) {
                    System.out.println("It's April");
                    break;
                } else if (month == 5) {
                    System.out.println("It's May");
                    break;
                } else if (month == 6) {
                    System.out.println("It's June");
                    break;
                } else if (month == 7) {
                    System.out.println("It's July");
                    break;
                } else if (month == 8) {
                    System.out.println("It's August");
                    break;
                } else if (month == 9) {
                    System.out.println("It's September");
                    break;
                } else if (month == 10) {
                    System.out.println("It's October");
                    break;
                } else if (month == 11) {
                    System.out.println("It's November");
                    break;
                } else if (month == 12) {
                    System.out.println("It's December");
                    break;
                }
            }

            case 3: {
                while (true) {
                    System.out.println("������� ����� ��� ����������� ��������");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) System.out.println("����� ������");
                    else System.out.println("����� ��������");
                    System.out.println("��������� ���? y/n");
                    char m = (char) System.in.read();
                    if (m == 'n') {
                        break;
                    }
                }
            }

            case 4: {
                while (true) {
                    System.out.println("������� ����������� �� �����");
                    int t = scanner.nextInt();
                    if (t <= -20) System.out.println("�� ����� �������");
                    else if ((-20 < t) && (t <= -5)) System.out.println("�� ����� ���������");
                    else if ((-5 < t) && (t <= 40)) System.out.println("�� ����� �����");
                    else System.out.println("�� ����� �����");
                    System.out.println("��������� ���? y/n");
                    char m = (char) System.in.read();
                    if (m == 'n') {
                        break;
                    }
                }
            }

            case 5: {
                while (true) {
                    System.out.println("������� ����� ������ ������ (� ���������: 1-7)");
                    int num = scanner.nextInt();
                    if (num == 1) System.out.println("�������");
                    else if (num == 2) System.out.println("���������");
                    else if (num == 3) System.out.println("������");
                    else if (num == 4) System.out.println("�������");
                    else if (num == 5) System.out.println("�������");
                    else if (num == 6) System.out.println("�����");
                    else System.out.println("����������");

                    System.out.println("��������� ���? (y/n)");
                    char c = (char) System.in.read();
                    if (c == 'n') {
                        break;
                    }
                }
            }

            case 6: {
                for (int i = 1, j = 0; (i < 99) && (j < 5); i++) {
                    if (i % 2 == 0) {
                        System.out.print(i);
                        System.out.print(" ");
                        j++;
                        if (j == 5) {
                            System.out.println();
                            j = 0;
                        }
                    }
                }
            }

            case 7: {
                for (int i = 5; i > 0; ) {
                    System.out.print(i + " ");
                    i--;
                }
            }

            case 8: {
                while (true) {
                    System.out.println("������� ����� ������������� �����");
                    int num = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= num; i++) {
                        sum += i;
                    }
                    System.out.println("����� ����� � ���������: �� 1 �� " + num + " = " + sum);
                    System.out.println("������� ���������? y/n");
                    char q = (char) System.in.read();
                    if (q == 'n') break;
                }

            }

            case 9: {
                int i = 1;
                int result = 0;
                while (result < 98) {
                    result = 7 * i;
                    System.out.print(result + " ");
                    i++;
                }
            }

            case 10: {
                int i = 1;
                while (i <= 10) {
                    System.out.print(-5 * i + " ");
                    i++;
                }
            }

            case 11: {
                int i = 10;
                do {
                    System.out.print(i * i + " ");
                    i++;
                } while (i <= 20);
            }

            case 12:{
                int num = 1;
                int prev = 0;
                int fib = 0;
                System.out.print("1 ");
                for (int j = 0; j < 10; j++) {
                    fib = num + prev;
                    prev = num;
                    num = fib;
                    System.out.print(fib + " ");
                }
            }

            case 13: {
                while(true){
                    System.out.println("������� ����� ������");
                    float deposit = scanner.nextInt();
                    System.out.println("������� ���������� �������");
                    float month = scanner.nextInt();
                    float percentage = 0;
                    for (int i = 0; i < month; i++) {
                        percentage = (float) (0.07 * deposit);
                        deposit = percentage + deposit;
                    }
                    System.out.println("�������� ����� ������ � ����������:");
                    System.out.println(deposit);
                    System.out.println("������ ����� �� ���������? y/n");
                    char c = (char) System.in.read();
                    if (c == 'y') break;
                }
            }

            case 14: {
                int mult = 0;
                for (int i = 1; i < 11; i++) {
                   // System.out.print( "|");
                    for (int j = 1; j < 11; j++) {
                        mult = i * j;
                        if(mult < 10 ) System.out.print(mult + "  ");
                        else System.out.print(mult  + " ");
                    }
                    System.out.println();
                }
            }

            case 15:{
                int count = 0;
                int sum1 = 0;
                int sum2 = 0;
                int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
                for (int i = 1001; i < 1000000; i++) {
                    n1 = i % 10;
                    n2 = (i / 10) % 10;
                    n3 = (i / 100) % 10;
                    n4 = (i / 1000) % 10;
                    n5 = (i / 10000) % 10;
                    n6 = (i / 100000) % 10;
                    sum1 = n1 + n2 + n3;
                    sum2 = n4 + n5+ n6;
                    if(sum1 == sum2) count++;
                }
                System.out.println("����� ���������� ������� " + count);
                }

            case 16: {
                int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
                int count = 0;
                for (int i = 50000; i > 1; i--) {
                    a1 = i % 10;
                    a2 = (i / 10) % 10;
                    a3 = (i / 100) % 10;
                    a4 = (i / 1000) % 10;
                    a5 = (i / 10000) % 10;
                    if((a1 == 2) || (a2 == 2) || (a3 == 2) || (a4 == 2) || (a5 == 2))
                    {
                        count++;
                    }
                }
                System.out.println("��������� ��������" + count);
            }

            case 17: {
                int h = 0;
                int m = 0;
                int t1 = 0, t2 = 0;
                int count = 0;
                for (int i = 0; i <= 24; i++) {
                    for (int j = 0; j <= 24; j++) {
                        h = i;
                        m = j;
                        if(h == m){ count++;}
                        t1 = i % 10;
                        t2 = (i/10) % 10;
                        h = t2*10 + t1;
                        //else if
                        if(h == m) { count++;}
                        System.out.print(h + " : " + m);
                        System.out.println();
                    }
                    System.out.println("������������ ���������� ���������: " + count + " ���");

                }
            }

            }


        }


    }



