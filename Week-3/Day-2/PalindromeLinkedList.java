class Solution {
    public ListNode reverse(ListNode head) {
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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode head2=s.next;
        s.next=null;
        head2=reverse(head2);
        while(head!=null&&head2!=null){
            if(head.val!=head2.val) return false;
            head=head.next;
            head2=head2.next;
        }
        return true;
    }
}