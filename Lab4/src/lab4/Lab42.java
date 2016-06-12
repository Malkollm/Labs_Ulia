

import java.util.Arrays;
import java.util.Random;
import lab4.Lab4;

/**
 * Парадова Юлия
 * Вывести через метод предыдущей задачи 5 массивов
 */
public class Lab42{

    public static void main(String[] args){
    int i=0;
    while(i<5){        
    System.out.println("mass" + Arrays.toString(Lab41.random_mass(1,4)));
    i++;
    }
    }
}
