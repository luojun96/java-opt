package org.jun.algorithms.tree;

import org.jun.algorithms.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {

    @Test
    void levelOrder() {
        LevelOrder levelOrder = new LevelOrder();
        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> list = levelOrder.levelOrder(node);

        List<List<Integer>> expectedList = new ArrayList<>();
        List<Integer> root = new ArrayList<>();
        root.add(3);
        expectedList.add(root);
        expectedList.add(Arrays.asList(9, 20));
        expectedList.add(Arrays.asList(15, 7));

        Assertions.assertEquals(list, expectedList);
    }
}