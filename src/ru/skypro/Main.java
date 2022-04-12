package ru.skypro;

import java.lang.reflect.Array;
import java.util.Arrays;

;

public class Main {

    public static void main(String[] args) {
        int[] ave = new int[30];
        int sum = 0;
        for (int i = 0; i < ave.length; i++ ){
            ave[i] = (int) Math.round((Math.random()*100_000)+ 100_000);
            sum = sum + ave[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(Arrays.stream(ave).max()+ " максимальная сумма трат составила");
        System.out.println(Arrays.stream(ave).min()+ " минимальная сумма трат за месяц составила");
        System.out.println(Arrays.stream(ave).average());
        var avg = Arrays.stream(ave).average(); // подскажите как тут сделать не дабл а флот?
        //А так можно?
        //Задача 2
        int maxSum = ave[0];
        for (int xx: ave) {
            if (xx>maxSum)
            maxSum = xx;
        }
        System.out.println(maxSum + " максимальная сумма трат составила");
        //example 2 min
        int minSum = ave[0];
        for (int uu: ave){
            if (uu<minSum){
                minSum = uu;
            }
        }
        System.out.println(minSum + " минимальная сумма трат за месяц составила");
        // example 3 average
        float average =0;
        for (float sumS: ave){
            average += sumS;
        }
        System.out.println(average/ave.length + " средняя сумма трат");
        // example 4 inanov

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
            if (i>0) System.out.print(" ");
        }
            }
        }

