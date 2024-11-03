import java.util.LinkedList;


//    Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        while (l1 != null) {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }
        Solution.addTwoNumbers(l1, l2);

    }

    static class Solution {
        public static void addTwoNumbers(ListNode l1, ListNode l2) {

            LinkedList<Object> linkedList1 = new LinkedList<>();
            LinkedList<Object> linkedList2 = new LinkedList<>();
//            StringBuilder s1 = new StringBuilder();
//            StringBuilder s2 = new StringBuilder();


            while (l1 != null) {
                linkedList1.addFirst(l1.val);
//                s1.append(l1.val);
                l1 = l1.next;

            }

            while (l2 != null) {
                linkedList2.addFirst(l2.val);
//                s2.append(l2.val);
                l2 = l2.next;
            }
//            while (linkedList1.)
//            s1.reverse();
//            s2.reverse();
//            System.out.println(s1);
//            System.out.println(s2);
            System.out.println(linkedList1);
            System.out.println(linkedList2);

        }
    }
}


