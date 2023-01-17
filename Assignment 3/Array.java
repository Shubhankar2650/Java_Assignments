package assignment3;

import javax.swing.event.InternalFrameEvent;
import java.util.Scanner;

import static java.lang.Math.abs;


public class Array {
    public static void printArray(int arr[]){
        for(int i :arr){
            System.out.print(i+ ",");
        }
        System.out.println();
    }
    // ✒1. How do you sort an array of 0 and 1?
    public static void sortZeroOne(int arr[]){
        int i = 0, j = arr.length -1;
        while(i<j){
            if(arr[i] == 0){
                i++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            }
        }
    }

    // ✒2. rotate an array if k = 0(doesn't rotate) if k >0 (rotate right), k<0(rotate left)
    public static void rotate(int arr[], int k){
        if(k == 0){
            System.out.println("No rotatation performed");
            return;
        }
        else if(k > 0){

            int n = arr.length, t = k;
            while(t != 0){
                int temp = arr[n-1];
                for(int i = n-1; i>0;i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
                t--;
            }

        }
        else{
            int n = arr.length, t = k;
            while(t!= 0){
                int temp = arr[0];
                for(int i = 0; i<n-1;i++){
                    arr[i] = arr[i+1];
                }
                arr[n-1] = temp;
                t++;
            }

        }
        System.out.print("for k = "+ k+ " Rotated Array is- ");
        printArray(arr);
    }

    // 5. Java Program to Find the Minimum Distance between Array Elements.
    public static int minimumDistance(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length-1;i++){
            int temp = abs(arr[i+1] - arr[i]);
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }
//
//    6. Java Programs on Inserting & Deleting Elements from an Array.
//7. Java Program to Cyclically Permute the Elements of an Array.

    // ✒️8. Java Program to Find the Missing Element in an Integer Array
//    public static void missingElement(){
//
//    }

    // ✒️9. Java Program to Print All the Leaders in an Array.
    public static void printLeaders(int ar[]) {
        int max = Integer.MIN_VALUE;
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] > max) {
                max = ar[i];
               System.out.print(max + ",");
            }
        }
        System.out.println();
    }
    // ✒10. Take an array as input from the user. Search for a given number x and print the index at
    //       which it occurs.4

    public static int [] inputArray(int n){
            Scanner sc = new Scanner(System.in);

            int arr1[] = new int[n];
            for(int i = 0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            sc.close();

        return arr1;
    }

    public static void indexAt(int arr[], int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println("Element" + x+" is present at index :- "+ i);
                return;
            }
        }

        System.out.println("Element is not present in the array");

    }

    public static void main(String[] args) {


        int arr1[] = {0,1,0,1,1,1,0,0};
        System.out.print("Given array:- ");
        printArray(arr1);
        sortZeroOne(arr1);
        System.out.print("Sorted array:- ");
        printArray(arr1);

        int arr2[] = {1,2,3,4,5,6,7};

        System.out.println("Given array:- " );
        printArray(arr2);
        rotate(arr2,0);
        rotate(arr2,-2);
        rotate(arr2,2);

        int arr5[] = {12,15,45,7,22,81};
        System.out.println(minimumDistance(arr5));

        int arr9[] = {12,15,2,4,6,7,3,1};
        printLeaders(arr9);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr10[] = inputArray(n);
        printArray(arr10);

        System.out.print("Enter the element to search: ");

        try{
            int y = sc.nextInt();
            indexAt(arr10,y);
        }catch (Exception e){
            System.out.println(e);
        }


        sc.close();


    }
}
