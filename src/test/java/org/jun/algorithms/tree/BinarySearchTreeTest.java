package org.jun.algorithms.tree;

import org.jun.algorithms.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void deleteNode() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode result = binarySearchTree.deleteNode(root, 5);
    }
}