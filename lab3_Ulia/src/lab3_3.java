/**
 * Парадова Юлия 1541б
 * вывести рандомные числа и подсчитать количество четных
 */
public class lab3_3 {
    public static void main(String[] args) {
        int[] a = new int[15];//создаем массив размерностью 15
        int v = 0;
        for (int i = 0; i < a.length; i++) {//от 0 до конца массива
            a[i] = (int) (Math.random() * 10);
            System.out.print(" " + a[i]);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {//проверка на чесность
                v++;
            }
        }
        System.out.print(v);
    }
}
