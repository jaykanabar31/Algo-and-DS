package LeetCode;



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2, head);
        Solution s = new Solution();

        s.reverseList(head2);


    }
    public ListNode reverseList(ListNode head) {

        ListNode reversed = null;
        reversed = helper(head, reversed);

        System.out.println(reversed.val);
        System.out.println(reversed.next.val);
        return reversed;
    }

    public ListNode helper(ListNode head, ListNode reversed) {

        //break condition
        if(head == null)
            return reversed;

        //Remove from front from the current list
        ListNode temp =  head;
        head = head.next;

        ListNode add = temp;

        if(reversed == null){
            reversed = add;
            reversed.next = null;
        }
        else{
            add.next = reversed;
            reversed = add;

        }


        return helper(head, reversed);
    }
}
