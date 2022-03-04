package org.jun.algorithms.backtracking;

public class Queens {
    private int[] queens;
    private int count;

    public Queens(int count) {
        this.count = count;
        this.queens = new int[count];
    }

    public void calNQueens(int row){
        if (row == count){
            printQueens(queens);
            return;
        }

        for (int column = 0; column < count; column++) {
            if (isOk(row, column)){
                queens[row] = column;
                calNQueens(row + 1);
            }
        }
    }

    private boolean isOk(int row, int column){
        int leftUp = column - 1, rightUp = column + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (queens[i] == column) return false;
            if (leftUp >= 0) {
                if (queens[i] == leftUp) return false;
            }
            if (rightUp < count){
                if (queens[i] == rightUp) return false;
            }
            leftUp--;
            rightUp++;
        }
        return true;
    }

    private void printQueens(int[] result){
        for (int row = 0; row < count; row++) {
            for (int column = 0; column < count; column++) {
                if (result[row] == column) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
