class List {
    Node head;
    Node tail;
    int size;



     public  void insertAtHead(int val){
        Node node=new Node(val);
        if(size==0){
            head=tail=node;
        }
        else{
            Node temp=head;
            node.next=temp;
            head=node;
        }
         size++;  
    }

     public  void insertAtTail(int val){
        Node node=new Node(val);
        if(size==0){
            head=tail=node;
        }
        else{
            //Node temp=head;
            tail.next=node;
            tail=node;
        }
         size++;  
    }


     public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
        return;
        //System.out.println();
    }

    public void printcustomList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
        return;
        //System.out.println("null");
    }

    public  Node merge(Node head1 , Node head2){
        Node dummy=new Node(-1);
        Node current=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
               current.next=head1;
               head1=head1.next;
            }
            else{
               current.next=head2;
               head2=head2.next;
            }
            current=current.next;
        }
        while(head1!=null){
            current.next=head1;
            current=current.next;
            head1=head1.next;
        }
          while(head2!=null){
            current.next=head2;
            current=current.next;
            head2=head2.next;
        }
        return dummy.next;

    }

    public void mergeList(List list2){
        Node head1=this.head;
        Node head2=list2.head;
        Node result=merge(head1,head2);
       // printcustomList(result);
       // System.out.println("result.."+result);

    }

  



    public static void main(String[] args) {
        List list1 = new List();
        List list2=new List();
        list1.insertAtHead(10);
        list2.insertAtHead(20);
        list1.insertAtHead(5);
        list2.insertAtHead(15);
        list1.mergeList(list2);
        list1.printList();
        list2.printList();

        
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

