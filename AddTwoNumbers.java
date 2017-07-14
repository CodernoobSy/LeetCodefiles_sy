public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode cur = l3;
        int sum = 0,extra = 0;
        
        while(l1 != null || l2 != null) {
            int a1 = l1 == null? 0:l1.val;
            int a2 = l2 == null? 0:l2.val;
            sum = a1 + a2 + extra;
            extra = sum >= 10 ?1:0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(extra == 1)
            cur.next = new ListNode(1);
        return l3.next;
    }
    
}