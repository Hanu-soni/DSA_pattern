//convert binary-tree to doubly linked list

import java.util.*;



class Solution{
    static int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
    static int index = 0;
     public static int  getNum(){
        //int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,-1};
        //int index=0;
        return arr[index++];
    }
    public static Node createTree(){
       // Scanner sc=new Scanner(System.in);
        Node tree=null;
        //root
         //System.out.println("enter node :");
        // int data=sc.nextInt();
        int data=getNum();
        if(data==-1){
            return null;
        }
        tree=new Node(data);

        //left
       // System.out.println("enter left Node");
        tree.left=createTree();

        //right
         //System.out.println("enter right Node");
        tree.right=createTree();

        return tree;


    }
    static Node head=null,prev=null;
    public static void convertToDL(Node root){
        //LNR
        if(root==null){
               while(prev!=null){
        System.out.print(prev.data+"-->");
        prev=prev.right;
       }
            return ;
        }
        convertToDL(root.left);
        //head.data=root.data;
        if(prev==null)head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;


        convertToDL(root.right);
        


        

    }
    public static void main(String[] args){
        
       Node root=createTree();
       //convert the tree to doubly linked list 
       convertToDL(root);
    


       
    }
   

}

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this. left=null;
        this.right=null;
        this.data=data;
    }
}

// class ListNode{
//     ListNode left;
//     ListNode right;
//     int data;
//     ListNode(int data);
//     this.left=null;
//     this.right=null;
//     this.data=data;
// }