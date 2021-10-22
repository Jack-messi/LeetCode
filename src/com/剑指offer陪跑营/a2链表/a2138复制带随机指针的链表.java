package com.剑指offer陪跑营.a2链表;

import java.util.HashMap;
import java.util.Map;

public class a2138复制带随机指针的链表 {
}


class Solutiona22 {
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
        while (cur!=null)
        {
            nodeMap.get(cur).next = nodeMap.get(cur.next);
            nodeMap.get(cur).random = nodeMap.get(cur.random);
            cur = cur.next;
        }
        return nodeMap.get(head);
    }
}