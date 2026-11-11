class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Node left=head,right=head;
        while(right.next!=null){
            right=right.next;
        }
        while(left!=right && left.prev!=right){
            //two-pointer appraoch
            int sum=left.data+right.data;
            
            if(target==sum){
                ArrayList<Integer> curr=new ArrayList<>();
                curr.add(left.data);
                curr.add(right.data);
                result.add(curr);
                left=left.next;
                right=right.prev;
            }
            else if(target>sum){
                left=left.next;
            }
            else{
                right=right.prev;
            }
            
            
        }
        return result;
    }
}