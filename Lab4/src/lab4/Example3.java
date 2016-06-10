
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
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int count1=0;
        int[] array = Lab4.rand_mass(1, 3); //присваиваем массив из предыдущей задачи
        System.out.println("Массив " + Arrays.toString(array)); //обращение к классу Main и методу rand_numb
        buble_sort(array); //вызываем метод
        System.out.print("Отсортированно ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if(array[i]==1){
            count1++;
            }
        }
        System.out.println("count1"+count1 );

    }
}