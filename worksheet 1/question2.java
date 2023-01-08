package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question2 {

    public static int[] arraay(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        return  arr1;
    }

    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void powerSet(int []  arr){

        int n = (int) Math.pow(2,arr.length);

        for(int i = 0; i< n; i++){
            List<Integer> set = new ArrayList<>();

            for (int j = 0; j< arr.length; j++){
                if((i & (1<<j)) != 0 ) {
                    set.add(arr[j]);
                }
            }
            System.out.println(set);
        }
    }

    public static void main(String[] args) {

        int[] arr = arraay();
        System.out.print("Given Array: ");
        print(arr);

        System.out.println();
        System.out.println("Power set is -");
        powerSet(arr);
    }
}

