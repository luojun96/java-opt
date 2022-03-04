package org.jun.algorithms.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRangeTest {

    @Test
    void searchRange() {
//        int[] nums = new int[]{5,7,7,8,8,8,8,10};
        int[] nums = new int[]{1};
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(nums, 1);
        Assertions.assertArrayEquals(new int[]{0, 0}, result);
    }
}