package assignment3;

import java.util.Scanner;

//3.Find out smallest and largest number in a given Array?

public class Q3 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<6; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }

        System.out.println("maximum number is- " + max);
        System.out.println("minimum number is- " + min);
    }
}
