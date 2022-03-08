package org.jun.algorithms.tree;

import org.jun.algorithms.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode tree = root;
        List<TreeNode> nodes = find(root, key);
        if (nodes == null)
            return tree;

        TreeNode targetNode = nodes.get(0);
        TreeNode parentOfTargetNode = nodes.get(1);

        if (targetNode.left != null && targetNode.right != null) {
            TreeNode parentOfMinRightNode = targetNode;
            TreeNode minRightNode = targetNode.right;
            while (minRightNode.left != null) {
                parentOfMinRightNode = minRightNode;
                minRightNode = minRightNode.left;
            }
            targetNode.val = minRightNode.val;
            targetNode = minRightNode;
            parentOfTargetNode = parentOfMinRightNode;
        }

        TreeNode child;
        if (targetNode.left != null)
            child = targetNode.left;
        else if (targetNode.right != null)
            child = targetNode.right;
        else
            child = null;

        if (parentOfTargetNode == null){
            tree = child;
        } else if (parentOfTargetNode.left == targetNode){
            parentOfTargetNode.left = child;
        } else {
            parentOfTargetNode.right = child;
        }
        return tree;
    }

    private List<TreeNode> find(TreeNode root, int key) {
        List<TreeNode> result = new ArrayList<>();
        TreeNode node = root;
        TreeNode pNode = null;
        while (node != null) {
            if (key < node.val){
                pNode = node;
                node = node.left;
            }
            else if (key > node.val){
                pNode = node;
                node = node.right;
            }
            else{
                result.add(node);
                result.add(pNode);
                return result;
            }
        }
        return null;
    }

    public TreeNode findMin(TreeNode root){
        if (root == null) return null;
        TreeNode p = root;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }

    public TreeNode findMax(TreeNode root) {
        if (root == null) return null;
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        return p;
    }
}
