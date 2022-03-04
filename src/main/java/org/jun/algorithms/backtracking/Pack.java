package org.jun.algorithms.backtracking;

public class Pack {
    public int maxW = Integer.MIN_VALUE;
    private boolean[][] mem = new boolean[5][10];

    /**
     * if the weight of pack is 100 kg, and the count of things is 10,
     * the weight of each thing is array A, this function is called like
     * f(0, 0, A, 10, 100)
     * @param i the index of thing to put into the pack
     * @param cw the total weight of things that already are in the pack
     * @param items things list
     * @param n the count of things
     * @param w the weight of pack
     */
    public void f(int i, int cw, int[] items, int n, int w){
        if (cw == w || i == n){
            if (cw > maxW) {
                maxW = cw;
            }
            return;
        }
        if (mem[i][cw]) return;
        mem[i][cw] = true;
        f(i + 1, cw, items, n, w);
        if (cw + items[i] <= w){
            f(i + 1, cw + items[i], items, n, w);
        }
    }
}
