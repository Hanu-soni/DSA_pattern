import java.util.*;



class Solution{
    public static void main(String[] args){
        
       Node tree=createTree();
       
    }
    public static Node createTree(){
        Scanner sc=new Scanner(System.in);
        Node tree=null;
        //root
         System.out.println("enter node :");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        tree=new Node(data);

        //left
        System.out.println("enter left Node");
        tree.left=createTree();

        //right
         System.out.println("enter right Node");
        tree.right=createTree();

        return tree;


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