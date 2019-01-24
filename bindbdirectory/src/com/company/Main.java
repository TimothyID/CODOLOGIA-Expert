package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lines/rows : ");
        int arraySize = scan.nextInt();
        int[][] pattern = new int[arraySize][arraySize];

        for (int i = 0; i < arraySize; ++i) {
            for (int j = 0; j < arraySize; ++j) {
                pattern[i][j] = i * arraySize + j + 1;
            }
        }

        for (int i = 0; i < arraySize; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < arraySize; ++j) {
                    System.out.printf("%3d", pattern[i][j]);
                }
            } else {
                for (int j = arraySize - 1; j >= 0; --j) {
                    System.out.printf("%3d", pattern[i][j]);
                }
            }
            System.out.println();
        }
    }
}


































/*package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = scan.nextInt();
        System.out.print("Enter number of stalin : ");
        int m = scan.nextInt();
	    int[][] array = new int[n][m];

	    int k = 0;
	    for(int i = 0; i < n; i++){
	        if(n % 2 == 0){
	            array[i][0] = m * i;
                System.out.println(array[i][0] + "  ");
	            for(int j = 1; j < m - 1; j++){
	                array[i][j] = array[i][j - 1] + 1;
                    System.out.print(array[i][j - 1] + "      ");
                }
            }
	        else{
	            array[i][0] = array[i - 1][m - 1] + m;
                for(int j = 0; j < m; j++){
                    array[i][j] = k;
                    k++;
                    System.out.print(array[i][j] + "    ");
                }

            }

            System.out.println();
        }
    }
}*/
