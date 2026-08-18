class Stack{
    int[] arr;
    int top;
    int[] minarr;
    int[] maxarr;
    int mintop;
    int maxtop;
    int size;
    Stack(int capacity){
        arr=new int[capacity];
        minarr=new int[capacity];
         maxarr=new int[capacity];
        top=-1;
        mintop=-1;
        size=capacity;
    }

    public void push(int val){
        if(size-1==top){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top]=val;
        //maintain min-stack
        if(mintop==-1 || val<minarr[mintop]){
            mintop++;
            minarr[mintop]=val;
            System.out.println("minarr[mintop]"+minarr[mintop]);
        }
         if(maxtop==-1 || val<maxarr[maxtop]){
            maxtop++;
            minarr[maxtop]=val;
            System.out.println("minarr[mintop]"+maxarr[maxtop]);
        }

    }
    public int pop(){
         if(top==-1){
            System.out.println("Stack is emp");
            return -1;
        }
         if(minarr[mintop]==arr[top]){
            mintop--;
        }
         if(maxarr[maxtop]==arr[top]){
            maxtop--;
        }
        top--;
        //maintain min-stack
       
        return arr[top];
    }
    public int min(){
        //i want minimum at any point at O(1)
        //I will maintain a minstack for this

        return minarr[mintop];


    }
     public int max(){
        //i want maximum at any point at O(1)
         //I will maxstack a minstack for this
         return minarr[mintop];

    }
    public int peek(){
        // if(type=="min"){
        //     return minarr[mintop];
        // }
        return minarr[mintop];
        
    }

    public static void main(String[] args){
        //call
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.push(11);
        System.out.println(stack.min());
       // System.out.println(stack.peek());
    }
}