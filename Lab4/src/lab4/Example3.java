
import java.util.Arrays;
import lab4.Lab4;

/**
 * Парадова Юлия
 * Сортировка массива пузырьком
 */
public class Example3 {
    public static void buble_sort(int[] nums) {
        for (int i = nums.length-1; i > 0; i--) { //вниз
            for (int j = 0; j < i; j++) { //вверх
                if (nums[j] > nums[j + 1]) { //если 1 элемент больше 2 то
                    int tmp = nums[j]; //присваиваем его временной переменной
                    nums[j] = nums[j + 1];//меняем местами оба элемента
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = Lab4.rand_mass(1, 3); //присваиваем массив из предыдущей задачи
        System.out.println("Массив " + Arrays.toString(array)); //обращение к классу Main и методу rand_numb
        buble_sort(array); //вызываем метод и передаем ему массив из предыдущей задачи
        System.out.print("Отсортированно ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //выводим массив, отсортированный
            }
        }
    }
}