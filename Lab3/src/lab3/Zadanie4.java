/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *Создать двумерный массив из 8 строк по 5 столбцов 
 * Парадова Юлия
 */
public class Zadanie4 {
   public static void main(String[] args) {
    
int[][] nums=new int[8][5]; //два массива

for(int i=0;i<nums.length;i++){ //от 0 до 8, на 1 больше
    for(int j=0;j<nums[i].length;j++){ //от 0 до 5 на 1 больше
     nums[i][j]=(int)(Math.random()*90+10); //от 10 до 99
    }
}
for(int i=0;i<nums.length;i++, System.out.println()){
    for(int j=0;j<nums[i].length;j++){
    System.out.print(nums[i][j] + " "); //вывод
    }
    }
   }

}
