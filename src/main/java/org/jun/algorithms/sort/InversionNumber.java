package org.jun.algorithms.sort;

// https://time.geekbang.org/column/article/281803
// Input: 7,9,2,6,14,12
/**
    Input: 7,9,2,6,14,12
    Output: 5
    The inversion numbers are: (7,2), (9,2), (7,6), (9,6), (14,12)
*/

public class InversionNumber {
    public int getInversionNumber(int[] array, int left, int right){
        // corner case
        if (array == null || array.length == 0) return 0;
        if (left == right) return 0;

        int mid = (left + right) / 2;
        int inversionNumberInLeftSide = getInversionNumber(array, left, mid);
        int inversionNumberInRightSide = getInversionNumber(array, mid + 1, right);
        int acrossInversionNumber = getAcrossInversionNumber(array, left, mid, right);
        return inversionNumberInLeftSide + inversionNumberInRightSide + acrossInversionNumber;
    }
    /*
    * 2,6,14         5,7,12
    *
    * */
    private int getAcrossInversionNumber(int[] array, int left, int mid, int right){
        int n = right - left + 1;
        int[] temp = new int[n];
        int p1 = left, p2 = mid + 1, k = 0, acrossInversionNumber = 0;
        while (p1 <= mid || p2 <= right){
            if( p2 > right || (p1 <= mid && array[p1] <= array[p2]) ){
                temp[k++] = array[p1++];
            } else{
                temp[k++] = array[p2++];
                acrossInversionNumber = acrossInversionNumber + (mid - p1 + 1);
            }
        }

        for(int i = 0, j = left; i < n; i++, j++){
            array[j] = temp[i];
        }

        return acrossInversionNumber;
    }
}
