/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку и обратно.
 *Парадова Юлия
 */
public class Zadanie2 {
    public static void main(String[] args) {
        
    int[] nums=new int[50];
    //Счетчики
        int q=0;
        int w=0;
    for(int i=1;i<=100;i=i+2){// от 1 до 100 нечетные
        nums[q]=i;//к массиву индекс
       System.out.print(" " + nums[q] + " ");//вывод массива
}
    System.out.println("");//отступ 
   for(int a=100-1;a>=1;a=a-2){//от 99 до 1 нечетные
       nums[w]=a;
       System.out.print(" " + nums[w] + " ");
   }
   System.out.println("");
} 
  
}   
