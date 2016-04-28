
public class Le_147_Insertion_Sort_List {
	public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode node = null;
        ListNode current = head;
        
        while(current != null){
            node = dummy;
            while(node.next != null && node.next.val < current.val){
                node = node.next;
            }
            
            ListNode nodeNext = node.next;
            ListNode currentNext = current.next;
            node.next = current;
            current.next = nodeNext;
            current = currentNext;
        }
        
        return dummy.next;
    }
}
