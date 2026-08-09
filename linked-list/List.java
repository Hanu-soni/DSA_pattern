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

    public  void midNode(){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        printCustom(slow) ;
    }


     public  void detectCycle(){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            if(fast==slow){
                System.out.println("List has cycle");
                return;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("List has no cycle");
        //printCustom(slow) ;
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

    public void findAtIndex(int i){
        //1->2->3->4->5      2    
        //head -1->2->3      0-1
        Node temp=head;
        if(i>size-1 ||i<0){
            System.out.println("invalid index");
            return;
        }
        for(int j=0;j<=i-1;j++){
            temp=temp.next;
        }
        System.out.println("found at index"+i+"  "+temp.data);
    }

    public void insertAtIndex(int i,int val){
        //1->2->3->4->5      2   ,10 
        //head -1->2->3      0-1   1 time   
        Node temp=head;
        Node node=new Node(val);
        if(i>size ||i<0){
            System.out.println("invalid index");
            return;
        }
        for(int j=0;j<i-1;j++){
            temp=temp.next;
        }
        node.next=temp.next.next;
        temp.next=node;
        System.out.println("inserted");
        if(i==size){
            size++;
        }
       printList();
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
        List list = new List();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.findAtIndex(3);
        list.insertAtIndex(4,80);
       // list.printList();

            //list.deleteEnd();


       
       // list.midNode();
       // System.out.println("mid node starts like....");
        
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

