/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Парадова Юлия
 */
public class Lab4 {

	//метод для инициализации рандомного числа
    public static int rand_numb(int a, int b) { //передаем методу 2 целых числа
       int c=(int) (Math.random() * b + a); //присваиваем переменной число [a;b]
       return c; //возвращаем то что получилось
    }
	//метод для инициализации рандомного массива 
    public static int[] rand_mass(int a, int b) { //передаем методу 2 целых числа
     int[] nums = new int[20]; //массив размером 20
     for(int i = 0;i<nums.length;i++){ //от 0 до 20
         nums[i]=(int) (Math.random() * b + a); //массиву присваиваем рандомные числа
     }
     return nums; //возвращаем результат
    }
    public static void main(String[] args) {
		//переводим массив в строковое представление и передаем методу 2 числа
        System.out.println("\n Массив через метод: " + Arrays.toString(rand_mass(1, 4 )));
        System.out.println("\n Выводим число: " + rand_numb(1, 4));

                
     }
    }
    

