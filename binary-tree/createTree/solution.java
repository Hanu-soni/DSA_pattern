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
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            Node curr = q.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
    }
    public static void LeftView(Node root){
        //level-order and print left
        //[1,2,3,4,5,7]
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            //calulate size
            int size=queue.size();

            for(int i=0;i<size;i++){
                Node val=queue.poll();
                if(i==size-1){
                    System.out.println(val.data);
                    //break;
                }
                if(queue.left!=null){
                queue.add(queue.left);
            }
            if(queue.right!=null){
                queue.add(queue.right)
            }
            }
            
            
        }

    }

    public static boolean identical(Node root1 , Node root2){
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && identical(root1.left,root2.right) && identical(root1.right && root2.left);
        // if(root1.val==root2.val){
        //     if(root1.left!=null && root2.left!=null){
        //         return identical(root1.left ,root2.left);
        //     }
        //     else{
        //         return false;
        //     }

        // }
    }
     // if(node.data==curr.data) print and stop;
     public static void printpath(Node result,int val){
        List<Integer> data=new ArrayList<>();
        testing(Node);
     }
    
      public static boolean testing(Node tree , List<Integer> data, int val){
        if(tree==null){
            //System.out.println(tree.data);
            return false;
        }
        data.add(tree.data);
        if(tree.data==val){
            return true;
        }

        if(testing(tree.left,data,val)|| testing(tree.right,data,val)){
             return true ;
        }
        data.remove(data.size());

      }

      public static int maxpathsum(Node root,int sum){
        if(root==null){
            return 0;
        }
        int leftMax=Math.max(maxpathsum(root.left),sum);
        int rightMax=Math.max(maxpathsum(root.right),sum);
        int curr=leftMax+rightMax+root.val;
        return Math.max(curr,sum);
        //leftMax and rightMax +curr.val

        //-1  
    //2          5
 // 6   9              8
      }
      //10 
    //5     40
//  1   7      50
//[10,15,1,7,40,50] NLR
//construct BST    
//result ---  10

     public static TreeNode constructTree(int[] arr,int start){
        // take first element
        if(arr.length==0)return null;
        TreeNode root=new TreeNode(arr[0]);
        // find smaller element and make it left
        int small=find(start+1,arr,root.val,"small");
        if(small!=-1){
            root.left=new TreeNode(small);
        }
        
        int large=find(start+1,arr,root.val,"large");
        if(large!=-1){
            root.right=new TreeNode(small);
        }
        
     }
     public static int find(int start,int[] arr,int target,String require){
        for(int i=start;i<arr.length;i++){
            if(require=="small"){
                if(arr[i]<=target)return arr[i];
            }
             if(require=="large"){
                if(arr[i]>target)return arr[i];
            }
        }
        return -1;
     } 






    // 1                                   
 // 2        3      
  //        4   5   

  //5

        // 1    
// // 2        3  
//4    5        7
    
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