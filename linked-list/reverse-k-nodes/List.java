  

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


    public Node reverseKGroup(Node head, int k) {
        Node temp=head,prevtail=null;
        while(temp!=null){
            Node check=temp;
            int count=0;
            while(count<k && check!=null){
                check=check.next;
                count++;
            }
             if (count < k) {
                prevtail.next = temp;
                break;
            }
            Node curr=temp,prev=null;
           for(int i=0;i<k;i++){
             Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           }
           if(prevtail==null){
            head=prev;
           }
           else{
            prevtail.next=prev;
           }
           //prevtail.next=prev;
           prevtail=temp;
           temp=curr;
        }
        return head;
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




//approach thinking
//check if we have enough nodes to reverse
//if yes , then do reversal as normal upto k
//after loop , save the last group tail 
// if prevtail is null , make head=prev
//otherwise make prevtail.next=prev.
//why?
//1->2->3->4->5->6  and  k=2
// we check reverse possible - yes
                        // we do reverse upto k
                        // 2->1->null . prevtail initially is null 
                        //my new head is prev which 2
                        //after this prevtail=temp which is 1
                        //again we repeat
// we check reverse possible -yes
                        // we do reverse upto k
                        //4->3->null
                        //prevtail==null , no
                        //so , prevtail.next=prev 
                        //so , now 1-> 4->3->null connected


//much clearer
// For each group:
//   1. Check k nodes exist from current position → if not, stop (leave remainder as-is)
//   2. groupHead = current node (this will become the tail after reversing)
//   3. Reverse k nodes, getting newGroupHead (the old kth node)
//   4. Connect: 
//        - if this is the first group → head = newGroupHead
//        - else → prevTail.next = newGroupHead
//   5. groupHead.next = nextGroupStart   (link reversed group's tail to rest of list)
//   6. prevTail = groupHead   (this group's original head is now its tail)
//   7. move current pointer to nextGroupStart, repeat

  
  
  