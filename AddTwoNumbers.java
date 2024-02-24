class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {
    }

    // Constructor with node value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with node value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnNode = null;
        ListNode nextNode = null;

        int cf = 0;

        while (l1 != null || l2 != null) {
            int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cf;
            cf = val / 10;
            val = val % 10;

            if (returnNode == null) {
                System.out.println(val);
                nextNode = new ListNode(val);
                returnNode = nextNode;

            } else {
                System.out.println(val);
                nextNode = new ListNode(val);
                returnNode.next = nextNode;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        }

        if (cf != 0) {
            System.out.println(cf);
        }

        return returnNode;
    }
}

/*

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> array = new ArrayList<>();

        int cf = 0;

        while (l1 != null || l2 != null) {
            int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cf;
            cf = val / 10;
            val = val % 10;

            array.add(val);

        }

        if (cf != 0) {
            array.add(cf);
        }

        ListNode returnNode = null;

        for (int i = 0; i < array.size(); i++) {
            if (returnNode == null) {
                returnNode = new ListNode(array.get(i));
            } else {
                returnNode.next = new ListNode(array.get(i));
            }
        }

        return returnNode;
    }
}

 */

