class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}



class ListBasic {
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

     public  void midNode(){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        printCustom(slow) ;
    }

    public void deleteEnd(){
        if(size==1){
            head=tail=null;
             System.out.println("List is empty");
            return;
        }
        else if(size==0){
            System.out.println("List is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            temp=tail;
        }
        size--;
    }

    public void deleteStart(){
        if(size==1){
            head=tail=null;
        }
        else if(size==0){
            System.out.println("List is empty");
            return;
        }
        else{
            Node temp=head.next;
            head=temp;
        }
        size--;
    }
   

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        return;
        //System.out.println("null");
    }

    public void printCustom(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ListBasic list = new ListBasic();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.printList();
         list.deleteEnd();
           list.printList();
          list.deleteEnd();
            list.printList();
           list.deleteEnd();
             list.printList();
            list.deleteEnd();
          list.printList();
           list.deleteEnd();
            //list.deleteEnd();


       
       // list.midNode();
       // System.out.println("mid node starts like....");
        
    }
}

