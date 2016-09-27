/**
 * Парадова Юлия 1541б
 * Вывести нечетные числа от 1-99, и 99-1
 */
public class lab3_2 {
    public static void main(String[] args) {
        int[] a = new int[50];//создаем массив размерностью 50
        int s = 0;
        int e = 0;
        for (int i = 1; i < 100; i++) {//начиная с 1 до 99
            if (i % 2 == 1) {//проверка на нечетность
                a[s] = i;
                System.out.print(" " + a[s]);
            }
        }
        System.out.println(" ");//отступ на строку ниже
        for (int x = 99; x >= 1; x--) {//начиная с 99 до 1
            if (x % 2 == 1) {//проверка на нечетность
                a[e] = x;
                System.out.print(" " + a[e]);
            }
        }
    }
}