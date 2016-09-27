/**
 * Парадова Юлия 1541б
 * Массив 8 строк 5 столбцов, рандом
 */
public class lab3_4 {
    public static void main(String[] args) {
        int[][] mass = new int[8][5];// создаем двумерный массив
        int c = 0;

        for (int i = 0; i < mass.length; i++) {//от до конца массива
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println();// столбики
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] % 2 == 0) {
                    System.out.print(" "+"-"+" ");
                } else {
                    System.out.print(" "+ mass[i][j] +" ");
                }
            }
        }}}
