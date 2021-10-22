package com.剑指offer陪跑营.a2链表;

import java.util.HashMap;
import java.util.Map;

public class a2剑指Offer35复杂链表的复制 {
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solutiona23 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> nodeMap = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            nodeMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            nodeMap.get(cur).next = nodeMap.get(cur.next);
            nodeMap.get(cur).random = nodeMap.get(cur.random);
            cur=cur.next;
        }
        return nodeMap.get(head);
    }
}
















