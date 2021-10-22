package com.剑指Offer;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 剑指Offer54二叉搜索树的第k大节点 {
    public static void main(String[] args) {

        List<Integer> qxList = new ArrayList<Integer>();
        List<Integer> zxList = new ArrayList<Integer>();
        List<Integer> hxList = new ArrayList<Integer>();
        TreeNode treeNode = new TreeNode(0);

        qxDigui(treeNode,qxList);
        qxList.sort(Comparator.naturalOrder());
//        qxList[]
    }
    public void TreeInfo() {
        List<Integer> qxList = new ArrayList<Integer>();
        List<Integer> zxList = new ArrayList<Integer>();
        List<Integer> hxList = new ArrayList<Integer>();
    }

    public static int kthLargest(TreeNode root, int k) {
        List<Integer> qxList = new ArrayList<Integer>();
        List<Integer> zxList = new ArrayList<Integer>();
        List<Integer> hxList = new ArrayList<Integer>();
        TreeNode treeNode = new TreeNode(0);

        qxDigui(treeNode,qxList);
        qxList.sort(Comparator.naturalOrder());
        System.out.println(qxList.toString());
        return qxList.get(qxList.size()-k);
    }



    //前序递归遍历
    public static void qxDigui(TreeNode treeNode, List<Integer> qxList) {
        qxList.add(treeNode.val);
        if (treeNode.left != null) {
            qxDigui(treeNode.left, qxList);
        }
        if (treeNode.right != null) {
            qxDigui(treeNode.right, qxList);
        }
    }

    //中序递归遍历
    public static void zxDigui(TreeNode treeNode, List<Integer> zxList) {
        if (treeNode.left != null) {
            zxDigui(treeNode.left, zxList);
        }
        zxList.add(treeNode.val);
        if (treeNode.right != null) {
            zxDigui(treeNode.right, zxList);
        }
    }

    //后续递归遍历
    public static void hxDigui(TreeNode treeNode, List<Integer> hxList) {
        if (treeNode.left != null) {
            hxDigui(treeNode.left, hxList);
        }
        if (treeNode.right != null) {
            hxDigui(treeNode.right, hxList);
        }
        hxList.add(treeNode.val);
    }
}

