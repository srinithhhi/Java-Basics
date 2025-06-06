import java.util.*;

public class Main
{
    static final int MaxSize= 2;
    static int [] stack = new int [MaxSize];
    static int top = -1;
    static void push (int val){
        if(top >= MaxSize){
            System.out.println("Stack overflow.");
            return;
        }
        stack[++top]=val;
        System.out.println(val + " is pushed into the stack.");
    }
    static void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        
        top--;
        System.out.println(stack[top--] + "is popped");
        
    }
    static void peek (){
        if (top == -1){
            System.out.println("Stack is empty.");
        }
        System.out.println("The top element is " +stack[top]);
        
    }
	public static void main(String[] args) {
		push(10);
		push(20);
	}
}
