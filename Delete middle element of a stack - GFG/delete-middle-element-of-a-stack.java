// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    int index;
    int count = 0;

    // Stack<Integer> temp = new Stack<Integer>();
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        if (sizeOfStack % 2 == 0)
            index = sizeOfStack / 2;
        if (sizeOfStack % 2 != 0)
            index =sizeOfStack / 2;
        // System.out.println(index);
        deleteTheElement(s, count);
    }

    public void deleteTheElement(Stack<Integer> s, int count) {
        // System.out.println(count);
        // if (count == index){
        //     s.pop();
        //     return ;
        // }
        // if (count > index)
        //     return;
        if (count == index){
            s.pop();
            return ;
        }
        count++;
        // if (s.peek() == null)
        //     return;
        int temp = s.pop();
        deleteTheElement(s, count);
        s.push(temp);
    }
}

