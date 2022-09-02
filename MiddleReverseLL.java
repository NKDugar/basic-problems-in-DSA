package com.company;

//import package java.com.company;
//  Definition for singly-linked list.
//

class MiddleReverseLL {
    public  class ListNode {
              int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode slow =head , fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
//            change few cinditions here thats it

        }
        return slow;
    }
}