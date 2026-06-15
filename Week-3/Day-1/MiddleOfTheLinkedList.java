class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1) return head;
        temp=head;
        for(int i=0;i<(size/2)-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        return head;
    }
}