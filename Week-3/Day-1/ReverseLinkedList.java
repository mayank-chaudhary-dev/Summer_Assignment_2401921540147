class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode fr=head;
        while(fr!=null){
            fr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fr;
        }return prev;
    }
}