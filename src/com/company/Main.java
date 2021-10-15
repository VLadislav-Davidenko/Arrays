package com.company;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	double[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {  //for (double v : arr)
            System.out.println(") " + Math.pow(arr[i],3));
        }
    String[][] arr1 = new String[2][3];
        arr1[0][0] = "Good";
        arr1[0][1] = "Better";
        arr1[0][2] = "The Best";
        arr1[1][0] = "Bad";
        arr1[1][1] = "Worse";
        arr1[1][2] = "The Worst";
        System.out.println("\n============================");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" -> " + arr1[i][j]);
            } System.out.println("\n============================");
        }
    }
}
