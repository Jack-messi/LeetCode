package com.程序员面试金典;

class Test123 {
}

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        int num = 0;
        while (temp != null) {
            num++;
            temp = temp.next;
        }
        int[] nums = new int[num];
        temp = head;
        int i = 0;
        while (temp != null) {
            nums[i++] = temp.val;
            temp = temp.next;
        }
        return sortArrayToBST(nums,0,num-1);

    }

    public TreeNode sortArrayToBST(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortArrayToBST(num, start, mid - 1);
        root.right = sortArrayToBST(num, mid + 1, end);
        return root;
    }
}