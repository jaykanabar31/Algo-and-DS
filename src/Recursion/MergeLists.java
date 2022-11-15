package Recursion;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedList = null;

        if(null == list1){

            if(null != list2){
                mergedList = list2;
            }

            return mergedList;
        }

        if(null == list2){

            if(null != list1){
                mergedList = list1;
            }

            return mergedList;
        }


        if(list1.val <= list2.val){
            ListNode add1 = new ListNode(list1.val);
//            ListNode add2 = new ListNode(list2.val);

//            add1.next = add2;

            mergedList = add1;

            list1 = list1.next;
//            list2 = list2.next;

            ListNode tempList = mergeTwoLists(list1, list2);

            mergedList.next = tempList;

            return mergedList;
        }

        if(list2.val <= list1.val){
            ListNode add2 = new ListNode(list2.val);
//            ListNode add1 = new ListNode(list1.val);

//            add2.next = add1;

            mergedList = add2;

//            list1 = list1.next;
            list2 = list2.next;

            ListNode tempList = mergeTwoLists(list1, list2);

            mergedList.next = tempList;
            return mergedList;
        }

        return mergedList;

    }

    public static void main(String[] args) {

        ListNode temp1 = new ListNode(1);
        ListNode temp2 = new ListNode(2);
        ListNode temp3 = new ListNode(3);

        temp2.next = temp3;
        temp1.next = temp2;

        ListNode list1 = temp1;

        ListNode temp4 = new ListNode(4);
        ListNode temp5 = new ListNode(5);
        ListNode temp6 = new ListNode(6);

        temp5.next = temp6;
        temp4.next = temp5;

        ListNode list2 = temp4;

        MergeLists ml = new MergeLists();
        ListNode finalList =ml.mergeTwoLists(list1, list2);

        while(finalList != null){
            System.out.println(finalList.val);
            finalList = finalList.next;
        }
    }
}
