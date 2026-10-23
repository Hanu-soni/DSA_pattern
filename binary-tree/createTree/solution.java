import java.util.*;



class Solution{
    static int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
    static int index = 0;
    public static void main(String[] args){
        
       Node root=createTree();
       InOrder(root);
       System.out.println(" ");
        PreOrder(root);
         System.out.println(" ");
        PostOrder(root);

       
    }
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
    public static void InOrder(Node root){
        if(root==null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
         InOrder(root.right);
        //System.out.print(root.data+" ");


    }
    public static void PreOrder(Node root){
        //NLR
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
         PreOrder(root.right);
        //System.out.print(root.data+" ");


    }
    public static void PostOrder(Node root){
        //LRN
        if(root==null){
            //System.out.print(root.data+" ");
            return ;
        }
        // if(root.right==null){
        //     System.out.print(root.data+" ");
        //     return ;
        // }
       // System.out.print(root.data+" ");
        PostOrder(root.left);
         PostOrder(root.right);
        System.out.print(root.data+" ");


    }
    public static int findMaxDepth(Node root){
        if(root==null){
            return Integer.MIN_VALUE; 
        }
       return Math.max(root.data,Math.max(findMaxDepth(root.left),findMaxDepth(root.right)));
    }
    public static void LevelOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root);
        if(root.left){
            System.out.println(root.left);
        }
         if(root.right){
            System.out.println(root.right);
        }
        if(root.left){
           LevelOrder(root.left);
        }
         if(root.right){
           LevelOrder(root.right);
        }
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