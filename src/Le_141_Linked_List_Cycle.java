
public class Le_141_Linked_List_Cycle {
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode faster = head.next, slower = head;  // 注意，faster必须和slower在开始时错开
        
        while(faster != null && faster.next != null && faster != slower){
            faster = faster.next.next;
            slower = slower.next;
        }
        
        return faster == slower;
    }
}
