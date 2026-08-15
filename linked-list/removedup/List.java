

class List {
    Node head;

   

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


     public Node deleteDuplicates(Node head) {
        Node dummy=new Node(-1);
        dummy.next=head;
        Node curr=head,prev=dummy;
        //keeping dummy.next saved
       
        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                int val=curr.val;
                while(curr!=null && curr.val==val){
                    curr=curr.next;
                }
                prev.next=curr;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
        
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }
}



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}




//remove duplicate from sorted list-2
//approach two pointers + dummy head.
//if curr and next val are same
// store val of node and skip till curr.val is same as val
// once over make prev.next as curr.

// Example - 
// 1->1->2->2->3->null
// 1==1  yes   store 1 in int
// compare   1==1  yes skip
//           1==1  yes skip
//           2==1 ,no , prev.next=2
// 2==2 yes     store 2 in int
// compare   2==2  yes skip
//           2==2  yes skip
//           2==3 ,no , prev.next=3
//now observe prev.next was 2 and now prev.next is 3
//so prev.next was never permanent until we are sure that curr!=curr.next or curr.next is null
//In else part , we therefore move prev=curr...
// 3==null no,
// else part -
//          prev=curr and curr is curr.next


// finally curr is null
// return dummy.next
// //cause we kept moving prev=curr , so the original node where it started is saved in dummy.next

