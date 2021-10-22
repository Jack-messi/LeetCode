package com.剑指offer陪跑营.a6树_二叉树;

import java.util.*;

public class 二叉树的前序遍历 {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//前序遍历
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}

//中序遍历
class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}

//后续遍历
class Solution3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;

    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}


//迭代前序遍历
class Solution4 {
    public List<Integer> preOrderIteration(TreeNode head) {
        List<Integer> res = new ArrayList<>();
        if (head == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}

//迭代中序遍历
class Solution5 {
    public List<Integer> inOrderIteration(TreeNode head) {
        List<Integer> res = new ArrayList<>();
        if (head == null) {
            return res;
        }
        TreeNode cur = head;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                cur = node.right;
            }
        }
        return res;
    }
}

//迭代后序遍历
class Solution6 {
    public List<Integer> postOrderIteration(TreeNode head) {
        List<Integer> res = new ArrayList<>();
        if (head == null) {
            return res;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            res.add(stack2.pop().val);
        }
        return res;
    }
}

//层次遍历
class Solution7 {
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  //将根节点入队
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();  //出队队头元素并访问
            res.add(node.val);
            if (node.left != null) {  //如果当前节点的左节点不为空入队
                queue.offer(node.left);
            }
            if (node.right != null) {  //如果当前节点的右节点不为空，把右节点入队
                queue.offer(node.right);
            }
        }
        return res;
    }
}





