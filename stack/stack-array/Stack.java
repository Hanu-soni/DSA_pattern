class Stack{
    int[] arr;
    int top;
    int[] minarr;
    int mintop;
    Stack(int capacity){
        arr=new arr[capacity];
        minarr=new arr[capacity];
        top=-1;
        mintop=-1;
        //size=capacity;
    }

    public void push(int val){
        if(arr.length==top-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top]=val;
        //maintain min-stack
        if(mintop==-1 || val<minStack.peek("min")){
            mintop++;
            minarr[top]=val;
        }

    }
    public int pop(){
         if(top==-1){
            System.out.println("Stack is emp");
            return;
        }
        top--;
        //maintain min-stack
        if(minStack.peek("min")==arr[top]){
            mintop--;
        }
        return arr[top];
    }
    public int min(){
        //i want minimum at any point at O(1)
        //I will maintain a minstack for this

        return minStack.peek("min");


    }
     public void max(){
        //i want maximum at any point at O(1)
         //I will maxstack a minstack for this

    }
    public int peek(String type){
        if(type=="min"){
            return minarr[mintop];
        }
        return arr[top];
        
    }

    public static void main(String[] args){
        //call
    }
}


