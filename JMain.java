import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JMain {
    public static void main(String[] args) {
        JSolution jsolution= new JSolution();

        int []nums={2,2,2,2,2};
        int target=8;
        String s="23";
        System.out.println(jsolution.fourSum(nums,target));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class JSolution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list= new ArrayList<ListNode>();
        ListNode t=head;
       
        while(t!=null){
            list.add(t);
            t=t.next;
        }
        int listLen= list.size();
        if(n==listLen){
            return list.get(1);
            
        }else if(n==1){
            t=list.get(listLen-n-1);
            t.next=null;
            return head;
        }else{
            t = list.get(listLen-n-1);
            t.next=list.get(listLen-n).next;
            return head;
        }
    }
    
}
