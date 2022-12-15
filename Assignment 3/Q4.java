package assignment3;

import java.util.Scanner;

//4. Java Program to Find Second Largest and Smallest Elements in an Array

public class Q4 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            arr[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE, max2 = max1;
        int min1 = Integer.MAX_VALUE, min2 = min1;

        for(int i = 0; i<6; i++){
            if(arr[i]>max1) max1 = arr[i];

            if(arr[i]<min1) min1 = arr[i];
        }

        for(int i = 0; i<6; i++){
            if(arr[i] > max2 && max2 < max1 && arr[i] != max1)    max2 = arr[i];

            if(arr[i]<min2 && min2 > min1 && arr[i] != min1) min2 = arr[i];
        }

        System.out.println("1st maximum number is- " + max1);
        System.out.println("2nd maximum number is- " + max2);
        System.out.println("1st minimum number is- " + min1);
        System.out.println("2nd minimum number is- " + min2);
    }
}
