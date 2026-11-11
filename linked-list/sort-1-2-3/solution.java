// 2. Given a Linked list of 0s, 1s and 2s, sort it

// Given a linked list of 0s, 1s and 2s, The task is to sort the list in non-decreasing order.

// Input: 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1 -> NULL
// Output: 0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2 -> NULL



/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zero=new Node(-1);
         Node one=new Node(-1);
          Node two=new Node(-1);
          //take end copy;
           Node zeroend=zero;
         Node oneend=one;
          Node twoend=two;
          
          while(head!=null){
              if(head.data==0){
                  zeroend.next=new Node(0);
                  zeroend=zeroend.next;
              }
              else if(head.data==1){
                  oneend.next=new Node(1);
                  oneend=oneend.next;
              }
             else if(head.data==2){
                  twoend.next=new Node(2);
                  twoend=twoend.next;
              }
              head=head.next;
          }
          zeroend.next=one.next!=null?one.next:two.next;
          oneend.next=two.next;
          twoend.next=null;
          return zero.next;
    }
}