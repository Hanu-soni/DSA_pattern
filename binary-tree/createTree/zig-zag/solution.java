// 3. Find distance between two nodes of a Binary Tree

// Input: a = 2, b = 3

// 	1
//    /        \
// 2		3

// Output: 2
// Explanation: The path between node 2 and node 3 is: 2 -> 1 -> 3.
// The number of edges in this path is 2, so the minimum distance is 2. 


// https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1

import java.util.*;



class Solution{
    static int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
    static int index = 0;

    // public static Node LowestCommon(Node root,int p , int q){
    //     if(root==null || root.val==p || root.val==q){
    //         return root;
    //     }
    //     Node left=LowestCommon(root.left,p,q);
    //     Node right=LowestCommon(root.right,p,q);

    //     if(left!=null && right!=null){
    //         return root;
    //     }
    //     if(left!=null){
    //         return left
    //     }
    //     return right;
        
    // }

    // public static int distance(Node root, int target){
    //     if(root==null){
    //         return -1;
    //     }
    //     if(root.val==target){
    //         return 0;
    //     }
    //     //go to left , check for target
    //     int left=distance(root.left,target);
    //     if(left!=-1){
    //         return left+1;
    //     }
    //     //go to right , check for target
    //     int right=distance(root.left,target);
    //     if(right!=-1){
    //         return right+1;
    //     }
    //     return -1;
    // }

    // public static void findDistance(TreeNode root,int p,int q ){
    //     if(root==null){
    //         return 0;
    //     }
    //     TreeNode lca=LowestCommon(root,p,q);
    //     if(lca==null)return -1;
    //     //find LCA
    //     //find distance p-LCA
    //     int d1=distance(lca,p);
        
    //     //find distance q-LCA
    //     int d2=distance(lca,q);

    //     if(d1==-1 || d2==-1)return -1;
    //     //return sum of distance
    //     return d1+d2;
    // }

    
        public static void zigzag(Node root) {

    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    boolean flag = true;
    //take result
    while (!queue.isEmpty()) {

        int size = queue.size();
        int[] arr = new int[size];
        //initialize array
       for(int i=0;arr.length;i++){
          Node curr=queue.poll();
          arr[i]=curr.data;
          if(flag){
            //right to left
            queue.add(curr.right);
            queue.add(curr.left);
          }
          else{
            queue.add(curr.left);
            queue.add(curr.right);
          }
       }
       flag=!flag;
    }
}

    public static void main(String[] args){
        
       Node root=createTree();
       //Node 
       zigzag(root);


       
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