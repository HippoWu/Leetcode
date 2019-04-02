/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode lr = new ListNode(0);
        ListNode result = lr;
        int carry = 0;
        int temp_sum;
        
        temp_sum = l1.val + l2.val + carry;
        if (temp_sum >= 10)
        {
            carry = 1;
            lr.val = temp_sum-10;
        }
        else
        {
            carry = 0;
            lr.val = temp_sum;
        }
        
        while ((l1.next != null) && (l2.next != null))
        {
            l1 = l1.next;
            l2 = l2.next;
            temp_sum = l1.val + l2.val + carry;
            if (temp_sum >= 10)
            {
                carry = 1;
                lr.next = new ListNode(temp_sum-10);
            }
            else
            {
                carry = 0;
                lr.next = new ListNode(temp_sum);
            }
            lr = lr.next;
        }
        
        if (l1.next == null)  //check l2
        {
            while (l2.next != null)
            {
                l2 = l2.next;
                temp_sum = + l2.val + carry;
                if (temp_sum >= 10)
                {
                    carry = 1;
                    lr.next = new ListNode(temp_sum-10);
                }
                else
                {
                    carry = 0;
                    lr.next = new ListNode(temp_sum);
                }
               lr = lr.next;
            }
        }
        
        if (l2.next == null)  //check l1
        {
            while (l1.next != null)
            {
                l1 = l1.next;
                temp_sum = + l1.val + carry;
                if (temp_sum >= 10)
                {
                    carry = 1;
                    lr.next = new ListNode(temp_sum-10);
                }
                else
                {
                    carry = 0;
                    lr.next = new ListNode(temp_sum);
                }
               lr = lr.next;
            }
        }
        
        if (carry == 1)
        {
            lr.next = new ListNode(1);
        }
        
        
        return result;
    }
}
