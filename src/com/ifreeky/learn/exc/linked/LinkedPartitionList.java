package com.ifreeky.learn.exc.linked;

/**
 * @link https://leetcode-cn.com/problems/partition-list/
 * @author ifreeky
 * @date 2021/1/3
 */
public class LinkedPartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }

        //@1 定义一个small链表和large链表
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        //@2 遍历head链表，小于X的放到small链表，大于等于的放到large链表
        ListNode curSmall = small;
        ListNode curLarge = large;
        while (head != null) {
            int val = head.val;
            if (val < x) {
                curSmall.next = head;
                curSmall = curSmall.next;
            }else {
                curLarge.next = head;
                curLarge = curLarge.next;
            }
            head = head.next;
        }


        //@3 连接small、large两个链表
        curLarge.next = null;
        curSmall.next = large.next;

        //@4 返回连接后的链表
        return small.next;
    }
}
