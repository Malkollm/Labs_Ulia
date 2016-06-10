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

    public static int rand_numb(int a, int b) {
       int c=(int) (Math.random() * b + a);
       return c;
    }
    public static int[] rand_mass(int a, int b) {
     int[] nums = new int[20];
     for(int i = 0;i<nums.length;i++){
         nums[i]=(int) (Math.random() * b + a);
     }
     return nums;
    }
    public static void main(String[] args) {
        System.out.println("\n Массив через метод: " + Arrays.toString(rand_mass(1, 4 )));
        System.out.println("\n Выводим число: " + rand_numb(1, 4));

                
     }
    }
    

