//package com.demo;
//
//import java.lang.reflect.Array;
//import java.util.PriorityQueue;
////class X {
////    public static void main(String args[])throws InterruptedException{
////        Thread t=new Thread(new Runnable() {
////            public void run() {
////                try {
////                    Thread.sleep(2000);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
////                System.out.print("2");
////            }
////        });
////        t.start();
////
//////        t.join();
////        System.out.print("1");
////    }
////
////}
//
//import java.util.*;
//
//class ListNode {
//    int val;
//
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}
//
////class Solution {
////    public ListNode removeElements(ListNode head, int val) {
////        ListNode header = new ListNode(-1);
////        header.next = head;
////        ListNode cur = header;
////        while (cur.next != null) {
////            if (cur.next.val == val) {
////                cur.next = cur.next.next;
////            }
////            else {
////                cur = cur.next;
////            }
////        }
////        return header.next;
////    }
////}
//
//
////class Solution {
////    public ListNode deleteNode(ListNode head, int val) {
////        ListNode header = new ListNode(-1);
////        header.next = head;
////        ListNode cur = header;
////        while (cur.next != null) {
////            if (cur.next.val == val) {
////                cur.next = cur.next.next;
////            } else {
////                cur=cur.next;
////            }
////        }
////        return header.next;
////    }
////}
//
//
////class Solution {
////    public ListNode getKthFromEnd(ListNode head, int k) {
////
////        ListNode header = new ListNode(-1);
////        header.next = head;
////        ListNode cur = header;
////        int num=0;
////        while (cur.next!=null)
////        {
////            cur=cur.next;
////            num++;
////        }
////        num = num-k;
////        cur=header;
////        int i=0;
////        while (i<num)
////        {
////            cur=cur.next;
////            i++;
////        }
////        return cur.next;
////    }
////}
//
////class Test {
////
////    public static void main(String[] args) {
////        ListNode h1 = new ListNode(1);
////        ListNode h2 = new ListNode(2);
////        ListNode h3 = new ListNode(3);
////        h1.next=h2;
////        h2.next=h3;
////        h3.next=null;
////        ListNode head = reverseList(h1);
////        while (head!=null)
////        {
////            System.out.println(head.val);
////            head = head.next;
////        }
////
////
////    }
////    public static ListNode reverseList(ListNode head) {
////        ListNode header = new ListNode(-1);
////        header.next = head;
////        ListNode cur = header;
////        ListNode move;
////        cur = cur.next;
////        header.next = null;
//////        System.out.println(cur.val);
////        while (cur != null) {
////
////            move = cur;
////            cur = cur.next;
////            move.next = header.next;
////            header.next = move;
////        }
////        return header.next;
////    }
////}
//
////
////class javaee {
////    public static void main(String[] args) {
////        int i=2;
////        int j=3;
////        System.out.println(i+~j);
////    }
////    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
////        ListNode header = new ListNode(-1);
////        ListNode pre = header;
////        while (l1 != null && l2 != null) {
////            if (l1.val <= l2.val) {
////                pre.next = l1;
////                pre = pre.next;
////                l1 = l1.next;
////            } else {
////                pre.next = l2;
////                pre = pre.next;
////                l2 = l2.next;
////            }
////        }
////        if (l1 != null) {
////            pre.next = l1;
////        }
////        if (l2 != null) {
////            pre.next = l2;
////        }
////        return header.next;
////    }
////}
//
////public class Solution {
////    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
////        ListNode h1 = headA, h2 = headB;
////        while (h1 != h2) {
////            h1 = h1 == null ? headA : h1.next;
////            h2 = h2 == null ? headB : h2.next;
////        }
////        return h1;
////    }
////}
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//
////class Solution {
////    public Node copyRandomList(Node head) {
////        if (head == null)
////            return null;
////        Node cur = head;
////        Map<Node, Node> map = new HashMap<>();
////        while (cur != null) {
////            map.put(cur,new Node(cur.val));
////            cur = cur.next;
////        }
////        cur =head;
////        while (cur!=null)
////        {
////            //map.get(cur)??????cur????????????
////            //map.get(cur.next)??????cur.next?????????
////            map.get(cur).next = map.get(cur.next);
////            map.get(cur).random = map.get(cur.random);
////            cur = cur.next;
////        }
////        return map.get(head);
////    }
////}
//
////
////class Solution {
////    public void javaqueue() {
////        //????????????
////        Queue<Integer> queue = new LinkedList<>();
////
////        //????????????
////        queue.add(1);
////        queue.add(2);
////        queue.add(3);
////        System.out.println(queue.toString());
////
////        //????????????,?????????
////        int temp1 = queue.peek();
////
////        //?????????????????????
////        int temp2 = queue.poll();
////
////        //????????????????????????,??????true??????false
////        boolean is = queue.isEmpty();
////
////        //????????????
////        int size1 = queue.size();
////
////        //????????????
////        while (!queue.isEmpty()) {
////            int temp =queue.poll();
////            System.out.println(temp);
////        }
////
////
////    }
////}
//
//
////class RecentCounter {
////    Queue<Integer> q;
////
////    public RecentCounter() {
////        q = new LinkedList<>();
////    }
////
////    public int ping(int t) {
////        q.add(t);
////        while (q.peek() < t - 3000) {
////            q.poll();
////        }
////        return q.size();
////    }
////}
//
////
////class Solution1 {
////    public static void main(String[] args) {
////        int[] nums = new int[]{4, -2};
////        int[] num = maxSlidingWindow(nums, 2);
////        System.out.println(Arrays.toString(num));
////    }
////
////    public static int[] maxSlidingWindow(int[] nums, int k) {
////        Queue<Integer> queue = new LinkedList<>();
////        int len = nums.length;
////        int[] num = new int[len - k + 1];
////        int x = 0;
////        for (int i = 0; i < k; i++) {
////            queue.add(nums[i]);
////        }
////        int max = Collections.max(queue);
////        num[x++]=max;
////        for (int i = k; i < len; i++) {
////            queue.poll();
////
////
////
////            if (queue.size() == k) {
//////                System.out.println(queue.toString());
////                num[x++] = Collections.max(queue);
////
////            }
////
////        }
////        return num;
////    }
////}
////
////class Solution1 {
////    public int[] maxSlidingWindow(int[] nums, int k) {
////        int n = nums.length;
////        //???????????????????????????????????????????????????????????????
////        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
////            public int compare(int[] pair1, int[] pair2) {
////                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
////            }
////        });
////        //????????????????????????????????? (num,index)???????????????num ????????????????????????index???
////        for (int i = 0; i < k; ++i) {
////            pq.offer(new int[]{nums[i], i});
////        }
////        //??????????????????
////        int[] ans = new int[n - k + 1];
////        //??????????????????
////        ans[0] = pq.peek()[0];
////
////        for (int i = k; i < n; ++i) {
////            pq.offer(new int[]{nums[i], i});
////
////            while (pq.peek()[1] <= i - k) {
////                pq.poll();
////            }
////            ans[i - k + 1] = pq.peek()[0];
////        }
////        return ans;
////    }
////}
////
////class stack {
////    public static void main(String[] args) {
////        //?????????stack
////        Stack<Integer> stack = new Stack<>();
////
////        //????????????
////        stack.push(1);
////        stack.push(2);
////        stack.push(3);
////        System.out.println(stack.toString());
////
////        //??????????????????
////        stack.peek();
////
////        //??????????????????
////        int temp = stack.pop();
////
////        //????????????
////        stack.size();
////
////        //???????????????
////        stack.isEmpty();
////
////        //????????????
////        while (!stack.isEmpty()) {
////            int num = stack.pop();
////            System.out.println(num);
////        }
////
////    }
////}
//
//
////class Solution1 {
////    public boolean isValid(String s) {
////        Stack<Character> ch = new Stack<>();
////        for (char c:s.toCharArray()){
////            if (c=='(') ch.push(')');
////            else if (c=='{') ch.push('}');
////            else if (c=='[') ch.push(']');
////            else if (ch.isEmpty()||c!=ch.pop()) return false;
////        }
////        return ch.isEmpty();
////    }
////}
////
////class Solution {
////    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
////        Stack<Integer> st = new Stack<>();
////        Stack<Integer> temp = new Stack<>();
////        int[] num = new int[nums1.length];
////        int te,f=0;
////
//////        for (int i : nums2) {
//////            st.push(i);
//////        }
////        for (int i = nums2.length - 1; i >= 0; i--) {
////            st.push(nums2[i]);
////        }
////        for (int i = 0; i < nums1.length; i++) {
////            while (!st.isEmpty()&&(nums1[i](te=st.pop())))
////            {
////                temp.push(te);
////            }
////
////        }
////        return num;
////    }
////}
//
////
////class Solutionw {
////    public static void main(String[] args) {
////        String s = "a";
////        String t = "aa";
////        char c = findTheDifference(s,t);
////        System.out.println(c);
////    }
////    public static char findTheDifference(String s, String t) {
////        HashMap<Character, Integer> hms = new HashMap<>();
////        HashMap<Character, Integer> hmt = new HashMap<>();
////        int i,j=0,x;
////        for (i = 0; i < s.length(); i++) {
////            x = hms.getOrDefault(s.charAt(i),0);
////            hms.put(s.charAt(i),1+x);
////            x = hmt.getOrDefault(t.charAt(i),0);
////            hmt.put(t.charAt(i), 1+x);
////        }
////
////        x = hmt.getOrDefault(t.charAt(i),0);
////        hmt.put(t.charAt(i), 1+x);
////
////        for (i = 0; i < t.length(); i++) {
////            int x1 = hms.getOrDefault(t.charAt(i), -1);
////            int x2 = hmt.getOrDefault(t.charAt(i), -1);
////            if (x1 != x2) {
////                j=i;
////                break;
////            }
////        }
////
////        return t.charAt(j);
////    }
////}
//
////class solution1{
////    public char findTheDifference(String s, String t) {
////        return (char) (t.chars().sum() - s.chars().sum());
////    }
////}
//
////class Solution {
////    public boolean containsDuplicate(int[] nums) {
////        HashMap<Integer, Integer> hm = new HashMap<>();
////        int f = 0;
////        for (int i = 0; i < nums.length; i++) {
////            int x = hm.getOrDefault(nums[i], 0);
////            if ((1 + x) > 1) {
////                f = 1;
////                break;
////            }
////            hm.put(nums[i], 1 + x);
////        }
////        if (f==1){
////            return true;
////        }
////        else {
////            return false;
////        }
////    }
////}
//
//
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> hs = new HashSet<>();
//        int s1, s2, f = 0;
//        for (int i = 0; i < nums.length; i++) {
//            s1 = hs.size();
//            hs.add(nums[i]);
//            s2 = hs.size();
//            if (s1 == s2) {
//                f = 1;
//                break;
//            }
//        }
//        if (f == 1) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
//
//
//class MyHashSet {
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyHashSet() {
//        PriorityQueue<Integer> minheap = new PriorityQueue<>();
//    }
//
//    public void add(int key) {
//
//    }
//
//    public void remove(int key) {
//
//    }
//
//    /**
//     * Returns true if this set contains the specified element
//     */
//    public boolean contains(int key) {
//
//    }
//}
//
///**
// * Your MyHashSet object will be instantiated and called as such:
// * MyHashSet obj = new MyHashSet();
// * obj.add(key);
// * obj.remove(key);
// * boolean param_3 = obj.contains(key);
// */
//
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//class Traverse {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        preorder(root, res);
//        return res;
//    }
//
//    public void preorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        res.add(root.val);
//        preorder(root.left, res);
//        preorder(root.right, res);
//    }
//}
//
//class dui {
//    public static void main(String[] args) {
//        //????????????????????????
//        PriorityQueue<Integer> minheap = new PriorityQueue<>();
//
//        //???????????????????????????????????????????????????
//        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
//
//        //??????????????????
//        minheap.add(10);
//        minheap.add(11);
//        maxheap.add(10);
//        maxheap.add(11);
//        System.out.println(minheap.toString());
//
//        //??????????????????????????????
//        minheap.peek();
//
//        //??????????????????
//        int temp = minheap.poll();
//
//        //??????????????????
//        minheap.size();
//
//        //????????????
//        while (!minheap.isEmpty()) {
//            System.out.println(minheap.poll());
//        }
//    }
//}
//
//
//class Solution3 {
//    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length - k];
//    }
//}
//
//
//class UnionFind {
//    //????????????int???????????????root
//    private int[] root = null;
//    private int count = 0;
//
//    public UnionFind(char[][] sid) {
//        //????????????
//        int row = sid.length;
//        int col = sid[0].length;
//
//        count = row * col;
//        root = new int[row * col];
//        for (int i = 0; i < row * col; i++) {
//            root[i] = i;
//        }
//    }
//
//    //Find the root of x
//    public int find(int x) {
//        if (x == root[x]) {
//            return root[x];
//        }
//        return root[x] = find(root[x]);
//    }
//
//    //Union two elements into one root
//    public void union(int x, int y) {
//        int rootX = find(x);
//        int rootY = find(y);
//        if (rootX != rootY) {
//            root[rootX] = rootY;
//            count--;
//        }
//    }
//}
//
//
//class Solution4 {
//    public ListNode ReverseList(ListNode head) {
//        ListNode header = new ListNode(-1);
//        ListNode h1, h2;
//        header.next = null;
//        h1 = head;
//        h2 = head;
//
//        while (h2 != null) {
//            h2 = h2.next;
//            h1.next = header.next;
//            header.next = h1;
//            h1 = h2;
//
//        }
//        return header.next;
//    }
//}