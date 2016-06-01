/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Марсель
 */
public class Zadanie3 {
    public static void main(String[] args) { 
        int c=0;
        int n=0;
    int[] nums=new int[15];//размер массива
    
    System.out.print("nums: ");
    for(int i=0;i<nums.length;i++){//от 1 до 15 увеличиваем на 1
    nums[i]=(int)(Math.random()*10);//вывод от 0 до 9 рандом значения
     System.out.print(" " + nums[i]);
    }
    for (int i=0;i<nums.length;i++){
        if (nums[i]%2==0){
            c++;
        }
    }
    System.out.println();
    System.out.println("Четные: " + c);
    }
}
  
   