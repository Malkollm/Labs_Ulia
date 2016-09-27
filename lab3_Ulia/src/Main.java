/**
 * Парадова Юлия 1541б
 * Вывести четные числа по горизонтали и вертикале
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];// создаем массив
        int s = 0;
        int d=0;
        for (int i = 2; i <= 20; i++) {// от 2 до 20, четные
            if (i % 2 == 0) {//проверка на четность
                a[s] = i;
                System.out.print(" " + a[s]);
            }
        }
        System.out.println();
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                a[d] = i;
                System.out.println(" " + a[d]);

            }
        }
    }
}