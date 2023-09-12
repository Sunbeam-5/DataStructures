package com.demo.sparsearray;

public class SparseArray {
    public static void main(String[] args) {
        int [][] chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        int count = 0;
        for (int [] row: chessArray
             ) {
            for (int line: row
                 ) {
                if (line != 0) {
                    count++;
                }
                System.out.printf("%d\t", line);
            }
            System.out.println();
        }

        System.out.println("----------------------");

        int [][] chessArray1 = new int[count + 1][3];
        chessArray1[0][0] = 11;
        chessArray1[0][1] = 11;
        chessArray1[0][2] = 3;

        int temp = count;
        for (int i = 0; i < chessArray.length; i++) {
            int k = 0;
            int l = 0;
            for (int j = 0; j < chessArray.length; j++) {
                if (chessArray[i][j] != 0) {
                    temp--;
                    k = k + count - temp;
                    chessArray1[k][l] = i;
                    l++;
                    chessArray1[k][l] = j;
                    l++;
                    chessArray1[k][l] = chessArray[i][j];
                }
            }
        }

        for (int [] row: chessArray1
             ) {
            for (int line: row
                 ) {
                System.out.printf("%d\t", line);
            }
            System.out.println();
        }

    }

}
