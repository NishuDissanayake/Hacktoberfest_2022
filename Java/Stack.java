import java.util.Stack;
 
class Stack
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
 
        stack.push("A");    // Insert `A` into the stack
        stack.push("B");    // Insert `B` into the stack
        stack.push("C");    // Insert `C` into the stack
        stack.push("D");    // Insert `D` into the stack
 
        // prints the top of the stack (`D`)
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();        // removing the top element (`D`)
        stack.pop();        // removing the next top (`C)
 
        // returns the total number of elements present in the stack
        System.out.println("The stack size is " + stack.size());
 
        // check if the stack is empty
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
