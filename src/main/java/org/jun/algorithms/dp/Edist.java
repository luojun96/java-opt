// https://www.geeksforgeeks.org/edit-distance-dp-5/
package org.jun.algorithms.dp;

public class Edist {
    private int min(int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        }
        if (y <= x && y <= z) {
            return y;
        }
        return z;
    }

    public int editEdist(String str1, String str2, int m, int n) {
        if (m == 0) return n;

        if (n == 0) return m;

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return editEdist(str1, str2, m - 1, n - 1);
        }

        return 1 + min(editEdist(str1, str2, m, n - 1),
                editEdist(str1, str2, m - 1, n),
                editEdist(str1, str2, m - 1, n - 1)
        );
    }
}
