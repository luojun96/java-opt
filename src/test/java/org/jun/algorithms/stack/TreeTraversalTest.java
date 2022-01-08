package org.jun.algorithms.stack;

import org.jun.algorithms.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalTest {
    private TreeTraversal treeTraversal;
    @BeforeEach
    void setUp() {
        treeTraversal = new TreeTraversal();
    }

    @AfterEach
    void tearDown() {
        treeTraversal = null;
    }

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> inorderResult = treeTraversal.inorderTraversal(root);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1, 3, 2));
        Assertions.assertEquals(expectedResult, inorderResult);
    }
}