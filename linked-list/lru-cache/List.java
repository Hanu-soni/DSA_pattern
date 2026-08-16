import java.util.*;
class Node {
    int key;
    int val;
    Node next;
    Node prev;

    Node(int key , int val) {
        this.key = key;
        this.val = val;
        this.next=null;
        this.prev=null;
    }
}


class Lrucache {
    int key;
    int val;
    String cmd;
    Lrucache(int key , int val , String cmd){
        this.key=key;
        this.val=val;
        this.cmd=cmd;

    }
    
}
class List {
    Node head;
    Node tail;
    Node size;


    public  void insertAtHead(int val){
        Node node=new Node(val);
        if(size==0){
            head=tail=node;
        }
        else{
            //Node temp=head;
            node.next=head;
            head=node;
        }
         size++;  
    }

     public  void removeAtTail(){
       // Node node=new Node(val);
        tail=tail.prev;
        tail.next=null;
       
    }

   

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node LRUcache(Lrucache commands,int capacity){
        //return the head after lrucache is done
        Map<Integer, Node> map = new HashMap<>();
        for(int i=0;i<commands.length;i++){
            if(commands[i].cmd=="put"){
                if(map.has(command[i].key)){
                    //if already exist , just update and move to front
                    Node node=new Node(command[i].key,command[i].value);
                    Node curr=map.get(command[i].key);
                    Node temp=curr.prev;
                    temp.next=curr.next;
                    node.next=head;
                    head=node;
                    map.put(command[i].key,head);
                }
                else{
                    //check if capacity is reached
                    if(size==capacity){
                        //remove the last from tail and add curr as head
                        tail=tail.prev;
                        tail.next=null;
                        Node node=new Node(commands[i].key,commands[i].val);
                        node.next=head;
                        head=node;
                         map.put(commands[i].key,head);
                    }
                    else{

                        //add the val as head and store it in map as well
                         Node node=new Node(commands[i].key,commands[i].val);
                         node.next=head;
                         head.prev=node;
                         head=node;
                         size++;
                         map.put(commands[i].key,head);
                    }
                }
            }
            else{
                if(head.key==commands[i].key){
                    System.out.println(head.val);
                    Node node=new Node(commands[i].key,commands[i].val);
                    node.next=head;
                }
                else{
                    //go to hashmap and find the node
                    Node data=map.get(commands[i].key);
                     System.out.println(data.val);
                      node.next=head;
                }
            }
        }


        


    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

    }
}




//Thinking approach -
// first understand what problem LRU cache solves.
//suppose I have some data in cache and my cache has capacity to store 5 data only.
//Also , when I get any data out of these 5 , it should be reachable at O(1).
//If I store any data, it should keep the latest data stored as head data
//If we have a new data to store and the list is full , then we remove LRU(least recently used)
//data and add the latest data in front.

//lets say we have memory of size 5
//now first command is put(1,5)
// check if key already exist in map
//        if "ues"--> get the node from map , update and put it in front
              "no"--> //check if size is reached
                           //if yes ,then remove the tail , make tail.prev as tail and put new node in front
                           //else , put the new data simply in front 
//if command is get , then check if head is the one required
//else use map and find required node, put that node in front and return the node
















// class LRUCache {

//     // --- Node defined as a private nested class ---
//     private class Node {
//         int key, val;
//         Node prev, next;
//         Node(int key, int val) {
//             this.key = key;
//             this.val = val;
//         }
//     }

//     private Map<Integer, Node> map;
//     private Node head, tail; // dummy head/tail (explained below)
//     private int capacity;

//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//         map = new HashMap<>();
//         head = new Node(-1, -1); // dummy head
//         tail = new Node(-1, -1); // dummy tail
//         head.next = tail;
//         tail.prev = head;
//     }

//     private void remove(Node node) {
//         node.prev.next = node.next;
//         node.next.prev = node.prev;
//     }

//     private void insertAtFront(Node node) {
//         node.next = head.next;
//         node.prev = head;
//         head.next.prev = node;
//         head.next = node;
//     }

//     public int get(int key) {
//         if (!map.containsKey(key)) return -1;
//         Node node = map.get(key);
//         remove(node);
//         insertAtFront(node);
//         return node.val;
//     }

//     public void put(int key, int value) {
//         if (map.containsKey(key)) {
//             remove(map.get(key));
//         }
//         Node node = new Node(key, value);
//         map.put(key, node);
//         insertAtFront(node);

//         if (map.size() > capacity) {
//             Node lru = tail.prev;
//             remove(lru);
//             map.remove(lru.key);
//         }
//     }
// }