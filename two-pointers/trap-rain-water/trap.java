class trap {
    public static int trap(int[] height) {

        //[0,1,3,1,0,0,4,1,0]
        //[0,1,3,3,3,3,]
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0]; //left of first element is nothing, thats why element itself is max
       rightmax[n-1] = height[n-1];//right of last element is nothing, thats why element itself is max
        //int j=n-2;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            rightmax[n-i-1]=Math.max(height[n-i-1],rightmax[n-i]);
        }
        //  for(int i=height.length-2;i>=0;i--){
           
        // }
        int water=0;
        for(int i=1;i<height.length-1;i++){
            int min=Math.min(leftmax[i],rightmax[i]);
            water=water+(min-height[i]);
        }
        return water;
    
    }
    public static void main(String[] args){
        int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result=trap(height);
        System.out.println(result);
    }
}