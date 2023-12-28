/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4.lab.oop;

/**
 *
 * @author GigaByte Computers
 */
import java.util.Arrays;
public class CodeReuse {
    
      public static void sortAscending(int[] set) {
        Arrays.sort(set);
    }
      
      
      public static double[] calculateStats(int[] data) {
        double[] stats = new double[3];
        int sum = 0;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int num : data) {
            sum += num;
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }

        stats[0] = maxNum;
        stats[1] = minNum;
        stats[2] = (double) sum / data.length;

        return stats;
    }
      
      
       public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        int[][] solution = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                solution[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return solution;
    }
}
