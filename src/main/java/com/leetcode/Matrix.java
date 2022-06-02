package com.leetcode;

public class Matrix {

    public int[][] transposeOfSquareMatrix(int[][] matrix) {
        
        for(int i =0; i< matrix.length; i ++){
            for(int j = i+1; j<matrix.length; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }
        return matrix;
    }
    
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] result = new int[n][m];
        
        for(int i =0; i< m; i ++){
            for(int j = 0; j<n; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
