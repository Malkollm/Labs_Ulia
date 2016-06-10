

import java.util.Arrays;
import java.util.Random;
import lab4.Lab4;

/**
 * Парадова Юлия
 * Вывести через метод предыдущей задачи 5 массивов
 */
public class Lab42{

    //выводит массив 1
    public static int[] Output_result(int[]nums){
        System.out.println("\n Массив выведенный через метод: ");

        for (int i = 0; i < nums.length; i++) {
            //массив = от 1 до 4 (рандомно)
            nums[i] = (int) (Math.random() * 15);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0; //используется в цикле для вывода 5и массивов
        Output_result(arr); //вывод 1 массива
        while (i<5){ //вывод 5и массивов заполненных в  предыдущей задаче
            System.out.println("Массив " + Arrays.toString(Lab4.rand_mass(1,4))); //обращение к классу Main и методу rand_numb
            i++;
        }
    }
}