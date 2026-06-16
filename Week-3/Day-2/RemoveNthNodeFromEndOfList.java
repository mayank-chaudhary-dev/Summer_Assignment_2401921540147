class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode s=head;
        ListNode f=head;
        for(int i=0;i<n;i++){
            f=f.next;
        }
        if(f==null){
            head=head.next;
            return head;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        s.next=s.next.next;
        return head;
    }
}