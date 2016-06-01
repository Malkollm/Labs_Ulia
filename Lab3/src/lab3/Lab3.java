/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *Создайте массив из всех чётных чисел от 2 до 20
 * Парадова Юлия
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
   int[] nums=new int[10];//размер массива
   //счетчик
   int q=0;
   int w=0;
   for(int i=2;i<=20;i=i+2){ //от 2 до 20 четные
       nums[q]=i;//массив=индекс
       System.out.print(" " +  nums[q] + " "); //вывод массива
   }
   System.out.println(""); //отступ вниз
   for(int a=2;a<=20;a=a+2){//четные
        nums[w]=a;
       System.out.println(" " +  nums[w]);
   }
    
    }
    }

