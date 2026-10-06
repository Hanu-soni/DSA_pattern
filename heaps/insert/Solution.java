class Solution{

    public static void printarr(int[] arr){
        
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(" ]");

    }

    public static void insert(ArrayList<Integer> arr , int element){
        //add this element at the end
        arr.add(element);
        int curr=arr.size()-1;
        int parent=(curr - 1) /2;
        while(arr.get(parent)<arr.get(curr) && curr>0){
            int temp=arr.get(parent);
            arr.set(parent, arr.get(curr));
        arr.set(curr, temp);
            curr=parent;
            parent=(curr-1)/2;
        }
        
    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1}; 
        printarr(arr);
        

    }
}